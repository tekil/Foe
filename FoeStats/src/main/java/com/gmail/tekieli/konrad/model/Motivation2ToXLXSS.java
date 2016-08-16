package com.gmail.tekieli.konrad.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONArray;
import org.json.JSONObject;

public class Motivation2ToXLXSS {
    private LocalDateTime fileCreationDate;
    private EventRecord lastRecordFromExcel = new EventRecord();
    List<EventRecord> eventRecordList;
    String path;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm");

    public Motivation2ToXLXSS(List<EventRecord> eventRecordList, LocalDateTime fileCreationDate, String path) {
        this.fileCreationDate = fileCreationDate;
        this.eventRecordList = eventRecordList;
        this.path = path;
    }

    public String saveMotivationToXLXS() {
        int lastRow;
        String result = "\nGenerate Motivation records - start \n";
        FileInputStream fis = null;
        XSSFWorkbook workbook = null;
        try {
            fis = new FileInputStream(new File(this.path));
            workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet("mot_list");
            XSSFRow row;
            XSSFCell cell;
            lastRow = sheet.getLastRowNum();
            System.out.println("lastRow: " + lastRow);
            if (lastRow > 0) {
                row = sheet.getRow(lastRow);
                cell = row.getCell(0);
                lastRecordFromExcel.setDateTime(LocalDateTime.parse(cell.getStringCellValue(), formatter));
                OtherPlayer otherPlayer = new OtherPlayer();
                otherPlayer.setPlayer_id(Integer.valueOf(row.getCell(2).getRawValue()));
                lastRecordFromExcel.setOther_player( otherPlayer);
            }
Period period;
            final int outputSize = 7;
            EventRecord eventRecord;
            for (int i = this.eventRecordList.size() - 1; i >= 0; i--) {
                eventRecord = eventRecordList.get(i);
                if ("social_interaction".equals(eventRecord.getType())
                        && ("polish".equals(eventRecord.getInteraction_type()) || "motivate".equals(eventRecord.getInteraction_type()) || "polivate_failed"
                                .equals(eventRecord.getInteraction_type()))) {
                   if(lastRecordFromExcel.getDateTime().isBefore(eventRecord.getDateTime()) && lastRecordFromExcel.getOther_player().getPlayer_id()!=eventRecord.getOther_player().getPlayer_id()){
//                       System.out.println(lastRecordFromExcel);
                       System.out.println(eventRecord);
                   
                        row = sheet.createRow(++lastRow);
                        cell = row.createCell(0);
                        cell.setCellValue(eventRecord.getDateTime().format(formatter));
                        cell = row.createCell(1);
                        cell.setCellValue(eventRecord.getInteraction_type());
                        cell = row.createCell(2);
                        cell.setCellValue(eventRecord.getOther_player().getPlayer_id());
                        cell = row.createCell(3);
                        cell.setCellValue(eventRecord.getOther_player().getName());
                        cell = row.createCell(4);
                        cell.setCellValue(eventRecord.getOther_player().getIs_guild_member());
                        cell = row.createCell(5);
                        cell.setCellValue(eventRecord.getOther_player().getIs_friend());
                        cell = row.createCell(6);
                        cell.setCellValue(eventRecord.getOther_player().getIs_neighbor());

                        // generate helper formula for filtering record in excel
                        cell = row.createCell(11);
                        cell.setCellType(XSSFCell.CELL_TYPE_FORMULA);
                        int index = lastRow + 1;
                        cell.setCellFormula("DATE(MID($A" + index + ",7,2)+2000,MID($A" + index + ",4,2),LEFT($A" + index + ",2))>=mot_list!$l$1");
                    }
                }
            }

            fis.close();
            FileOutputStream fos = new FileOutputStream(new File(this.path));
            workbook.write(fos);
            workbook.close();
            fos.close();
            System.out.println("Done");
            result += "Generate Motivation records - end";
        } catch (IOException e) {
            result += e.toString();
        }
        return result;
    }

}
