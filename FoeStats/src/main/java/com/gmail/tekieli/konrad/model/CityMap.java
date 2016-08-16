package com.gmail.tekieli.konrad.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.gmail.tekieli.konrad.Utils;

public class CityMap {

    private List<UnlockedArea> unlockedAreas = new ArrayList<UnlockedArea>();
    private List<Entity> entities = new ArrayList<Entity>();
    private String _class;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public CityMap(JSONObject obj) {
        for (int i = 0; i < obj.getJSONArray("entities").length(); i++) {
            this.entities.add(new Entity(obj.getJSONArray("entities").getJSONObject(i)));
        }

        this._class = Utils.setValueString("__class__", obj);
    }

    public List<UnlockedArea> getUnlockedAreas() {
        return unlockedAreas;
    }

    @Override
    public String toString() {
        return "CityMap [unlockedAreas=" + unlockedAreas + ", entities=" + entities + ", _class=" + _class + ", additionalProperties="
                + additionalProperties + "]";
    }

    public void setUnlockedAreas(List<UnlockedArea> unlockedAreas) {
        this.unlockedAreas = unlockedAreas;
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
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
