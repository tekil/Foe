package com.gmail.tekieli.konrad;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import sun.awt.image.PixelConverter.Bgrx;

import com.gmail.tekieli.konrad.model.EventRecord;
import com.gmail.tekieli.konrad.model.GreatBuildingRankingRow;
import com.gmail.tekieli.konrad.model.OtherPlayer;

public class GreatBuildingRowsRewarsToXLXS {

    String path;
    List<GreatBuildingRankingRow> greatBuildingRankingRows;
    String gbName;
    public GreatBuildingRowsRewarsToXLXS(List<GreatBuildingRankingRow> buildingRankingRows, String string, String string2) {
       this.path = string2;
       this.greatBuildingRankingRows = buildingRankingRows;
       this.gbName = string;
       
    }

    public void saveToXLXS() {
        System.out.println(this.greatBuildingRankingRows);
        int lastRow;
        int gbLVL;
        int totalPR=0;
        int howManyRecorded = 0;
        String result = "\nGenerate Motivation records - start \n";
        FileInputStream fis = null;
        XSSFWorkbook workbook = null;
        try {
            fis = new FileInputStream(new File(this.path));
            workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet(gbName + "_RewarList");
            XSSFRow row;
            XSSFCell cell;
            lastRow = sheet.getLastRowNum();
            System.out.println("lastRow: " + lastRow);
            if (lastRow > 5) {
                row = sheet.getRow(lastRow-5);
                cell = row.getCell(0);
               gbLVL = Integer.valueOf(row.getCell(0).getStringCellValue()) + 1;
               System.out.println("gbLVL " + gbLVL);
            }else{
                gbLVL = 11;
            };
            for (int i = 0; i <this.greatBuildingRankingRows.size(); i++) {
                totalPR += this.greatBuildingRankingRows.get(i).getForge_points();
            }
            
            row = sheet.createRow(++lastRow);
            cell = row.createCell(0);
            row = sheet.createRow(++lastRow);
            cell = row.createCell(0);
            cell.setCellValue(Integer.toString(gbLVL));
            System.out.println(Integer.toString(gbLVL));
            cell = row.createCell(1);
          
            cell = row.createCell(2);
            cell.setCellValue(Integer.toString(totalPR));
            cell = row.createCell(3);
            
            
            for (int i = 0; i <6; i++) {
                if(greatBuildingRankingRows.get(i).getRank() == null || howManyRecorded == 5) break;
                
                
                row = sheet.createRow(++lastRow);
                cell = row.createCell(0);
                cell = row.createCell(1);
                cell.setCellValue(this.greatBuildingRankingRows.get(i).getRank().toString());
                cell = row.createCell(2);
                cell.setCellValue(this.greatBuildingRankingRows.get(i).getReward().getStrategy_point_amount().toString());
                cell = row.createCell(3);
                cell.setCellValue(this.greatBuildingRankingRows.get(i).getReward().getBlueprints().toString());
                howManyRecorded ++;
             
                
            }

            fis.close();
            FileOutputStream fos = new FileOutputStream(new File(this.path));
            workbook.write(fos);
            workbook.close();
            fos.close();
            System.out.println("Done");
            result += "Generate Motivation records - end";
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        
    }

}
