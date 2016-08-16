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
import com.gmail.tekieli.konrad.model.GreatBuildingRankingRow;
import com.gmail.tekieli.konrad.model.Motivation2ToXLXSS;
import com.gmail.tekieli.konrad.model.OtherPlayerCity;

public class CityMapService {
    String requestMethod = null;
    String requestClass = null;
    String dayString = "dzisiaj";
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy HH:mm");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm");
    LocalDate lastUsedDate;
    LocalDateTime fileCreationDate;

    final Logger logger = LoggerFactory.getLogger(CityMapService.class);
    public JSONArray array;
    private int nrDaysAgo;
    private Properties props;

    public CityMapService(Properties props) {
        this.props= props;
    }
    
   

    public String updateEntityGetIdString(JSONObject responseData) {
        Entity entity =new Entity(responseData);

        logger.debug("CityMapService - updateEntity {} ",entity.getCityentityId());
        
        return entity.getCityentityId();
    }



    public void saveGreatBuildingLvlsRewards(JSONArray jsonArray, String GbName) {
        System.out.println("saveGreatBuildingLvlsRewards");
     List<GreatBuildingRankingRow> buildingRankingRows = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            GreatBuildingRankingRow buildingRankingRow = new GreatBuildingRankingRow(jsonArray.getJSONObject(i));
            buildingRankingRows.add(buildingRankingRow);
        }
        GreatBuildingRowsRewarsToXLXS greatBuildingRowsRewarsToXLXS = new GreatBuildingRowsRewarsToXLXS(buildingRankingRows,  GbName, this.props.getProperty("pathExcel"));
        greatBuildingRowsRewarsToXLXS.saveToXLXS();
    }

   
    
}