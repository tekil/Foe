package com.gmail.tekieli.konrad.model;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.gmail.tekieli.konrad.Utils;

public class OtherPlayerCity {

    public OtherPlayerCity(JSONObject obj) {
        super();
        if (obj.has("other_player")) {
            this.otherPlayer =new OtherPlayerData(obj.getJSONObject("other_player"));
        } else {
            this.otherPlayer = null;
        }
       
        if (obj.has("city_map")) {
            this.city_map = new CityMap(obj.getJSONObject("city_map"));
        } else {
            this.city_map = null;
        }
      
        this.can_sabotage = Utils.setValueBoolean( "can_sabotage", obj);
        this.other_player_era = Utils.setValueString("other_player_era", obj);
        this._class = Utils.setValueString("__class__", obj);
    }

    @Override
    public String toString() {
        return "OtherPlayerCity [otherPlayer=" + otherPlayer + ", city_map=" + city_map + ", can_sabotage=" + can_sabotage + ", other_player_era="
                + other_player_era + ", _class=" + _class + ", additionalProperties=" + additionalProperties + "]";
    }

    private OtherPlayerData otherPlayer;

    private CityMap city_map;

    private Boolean can_sabotage;

    private String other_player_era;

    private String _class;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public OtherPlayerData getOtherPlayer() {
        return otherPlayer;
    }

    public void setOtherPlayer(OtherPlayerData otherPlayer) {
        this.otherPlayer = otherPlayer;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public CityMap getCity_map() {
        return city_map;
    }

    public void setCity_map(CityMap city_map) {
        this.city_map = city_map;
    }

    public Boolean getCan_sabotage() {
        return can_sabotage;
    }

    public void setCan_sabotage(Boolean can_sabotage) {
        this.can_sabotage = can_sabotage;
    }

    public String getOther_player_era() {
        return other_player_era;
    }

    public void setOther_player_era(String other_player_era) {
        this.other_player_era = other_player_era;
    }

    public String getClass_() {
        return _class;
    }

    public void setClass_(String _class) {
        this._class = _class;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
