package com.gmail.tekieli.konrad;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gmail.tekieli.konrad.model.OtherPlayerCity;

public class ReadJSONFile {
    JSONArray array;
    LocalDateTime calendar;
    OtherPlayerService otherPlayerService;
    CityMapService cityMapService;
    String greatBuildingName = null;
    private Properties props;

    public ReadJSONFile(JSONArray array, LocalDateTime ldt, Properties prop) {
        this.array = array;
        this.calendar = ldt;
        this.props = prop;
        this.otherPlayerService = new OtherPlayerService(props);
        this.cityMapService = new CityMapService(props);
    }

    public void execute() {
        String requestMethod = null;
        String requestClass = null;

        final Logger logger = LoggerFactory.getLogger(ReadJSONFile.class);

        for (int i = 0; i < this.array.length(); i++) {
            requestMethod = array.getJSONObject(i).getString("requestMethod");
            requestClass = array.getJSONObject(i).getString("requestClass");
            logger.debug("requestClass: {} , requestMethod: {} ", requestClass, requestMethod);

            if ("visitPlayer".equals(requestMethod)) {
                otherPlayerService.visitOtherPlayer(array.getJSONObject(i).getJSONObject("responseData"));
            }// motivation history
            else if ("getEvents".equals(requestMethod)) {
                otherPlayerService.getEvent(array.getJSONObject(i).getJSONArray("responseData").getJSONArray(0), this.calendar);
            } else if ("updateEntity".equals(requestMethod) && "CityMapService".equals(requestClass)) {
                this.greatBuildingName = cityMapService.updateEntityGetIdString(array.getJSONObject(i).getJSONArray("responseData").getJSONObject(0));
                System.out.println(this.greatBuildingName);
            } else if ("true".equals(this.props.getProperty("generateGreatBuildingRewardList")) && "getConstructionRanking".equals(requestMethod)
                    && "GreatBuildingsService".equals(requestClass) && this.greatBuildingName != null) {
                System.out.println(this.greatBuildingName + "****");
                cityMapService.saveGreatBuildingLvlsRewards(array.getJSONObject(i).getJSONArray("responseData"), this.greatBuildingName);
            }
        }

        this.greatBuildingName = null;
    }

}
