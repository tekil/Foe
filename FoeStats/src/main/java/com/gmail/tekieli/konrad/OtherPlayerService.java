package com.gmail.tekieli.konrad;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.*;
import java.time.format.DateTimeFormatter;

import com.gmail.tekieli.konrad.model.Entity;
import com.gmail.tekieli.konrad.model.EventRecord;
import com.gmail.tekieli.konrad.model.Motivation2ToXLXSS;
import com.gmail.tekieli.konrad.model.OtherPlayerCity;

public class OtherPlayerService {
    String requestMethod = null;
    String requestClass = null;
    String dayString = "dzisiaj";
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy HH:mm");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm");
    LocalDate lastUsedDate;
    LocalDateTime fileCreationDate;

    final Logger logger = LoggerFactory.getLogger(OtherPlayerService.class);
    public JSONArray array;
    private int nrDaysAgo;
    private Properties props;

    public OtherPlayerService(Properties props) {
        this.props = props;
    }
    
    public OtherPlayerService(LocalDateTime fileCreationDate) {
        this.fileCreationDate = fileCreationDate;
    }

    public void visitOtherPlayer(JSONObject responseData) {
        OtherPlayerCity otherPlayerCity = new OtherPlayerCity(responseData);

        logger.debug("{}. {}, can sabotage? {}",otherPlayerCity.getOtherPlayer().getRank(), otherPlayerCity.getOtherPlayer().getName(), otherPlayerCity.getCan_sabotage());

        for (Entity entity : otherPlayerCity.getCity_map().getEntities()) {
            if (entity.getState().getCurrentProduct() != null) {
                if ("ProductionFinishedState".equals(entity.getState().getClass_())
                        && ("P_MultiAge_HalloweenBonus15".equals(entity.getCityentityId())
                                || "P_MultiAge_SummerBonus15".equals(entity.getCityentityId())
                                || "P_MultiAge_CupBonus16".equals(entity.getCityentityId()) || "goods".equals(entity.getType()))) {
                    
                    if( entity.getState().getCurrentProduct().getRevenue()!= null && !entity.getState().getCurrentProduct().getRevenue().getGoods().isEmpty()){
                        System.out.println("**cityentity_id " + entity.getCityentityId() + " po " + entity.getState().getCurrentProduct().getRevenue().getGoods().get(0).getValue());
                    }else if (entity.getState().getCurrentProduct().getRevenue()!= null && entity.getState().getCurrentProduct().getRevenue().getStrategy_points() != null && entity.getState().getCurrentProduct().getRevenue().getStrategy_points()>0){
                        System.out.println("**cityentity_id " + entity.getCityentityId() + " PR: " + entity.getState().getCurrentProduct().getRevenue().getStrategy_points());
                    }
                    System.out.println("##cityentity_id " + entity.getCityentityId() + " ; " + entity.getState().getCurrentProduct());
                }
            }
        }

    }

    public void getEvent(JSONArray responseData, LocalDateTime fileCreation) {
        JSONArray array = responseData;
        this.fileCreationDate = fileCreation;
        this.nrDaysAgo = 0;
        List<EventRecord> eventRecordList = new ArrayList<>();
        EventRecord eventRecord;
           
        for (int i = 0; i < array.length(); i++) {
             eventRecord = new EventRecord(array.getJSONObject(i));
            setEventDate(eventRecord);
            eventRecordList.add(eventRecord);
            
        }
        System.out.println("***********************************************************");
        for (int i = eventRecordList.size()-1; i >0 ; i--) {
            eventRecord = eventRecordList.get(i);
             
//            System.out.println(eventRecord.getDateTime().format(this.formatter));
        }
        Motivation2ToXLXSS motivation2ToXLXS = new Motivation2ToXLXSS(eventRecordList,  this.fileCreationDate, this.props.getProperty("pathExcel"));
        motivation2ToXLXS.saveMotivationToXLXS();
    }
    
    private void setEventDate(EventRecord eventRecord){
        String dateString = eventRecord.getDate();
        LocalDate localDate;
        LocalTime localTime = LocalTime.parse(dateString.split(" ")[2]);
        LocalDateTime localDateTime;
        String day = dateString.split(" ")[0];
        if ( this.dayString.equals(day)){
        }else{
            this.dayString = day;
            this.nrDaysAgo++;
            
        }
        localDate = LocalDate.from(this.fileCreationDate.minusDays( this.nrDaysAgo));
        localDateTime= LocalDateTime.of(localDate, localTime);
        eventRecord.setDateTime(localDateTime);
//        System.out.println(eventRecord.getDateTime().format(this.formatter));
       
    }
}