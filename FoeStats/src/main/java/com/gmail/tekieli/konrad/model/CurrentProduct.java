
package com.gmail.tekieli.konrad.model;

import java.util.HashMap;
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

public class CurrentProduct {

    private Revenue revenue;
    private Integer collectionTime;
    private Boolean becomesStale;
    private String name;
    private Integer productionTime;
    private String assetName;
    private String _class;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public CurrentProduct(JSONObject obj) {
        
        if (obj.has("revenue")) {
            this.revenue =  new Revenue(obj.getJSONObject("revenue"));
        }else{
            this.revenue =  null;
        }
      
        this.becomesStale =  Utils.setValueBoolean("becomes_stale", obj);
        this.collectionTime =  Utils.setValueInt("collection_time", obj);
        this.productionTime =  Utils.setValueInt("production_time", obj);
        this._class = Utils.setValueString("__class__", obj);
    }
    public Revenue getRevenue() {
        return revenue;
    }

    public void setRevenue(Revenue revenue) {
        this.revenue = revenue;
    }

    public Integer getCollectionTime() {
        return collectionTime;
    }

    public void setCollectionTime(Integer collectionTime) {
        this.collectionTime = collectionTime;
    }

    public Boolean getBecomesStale() {
        return becomesStale;
    }

    public void setBecomesStale(Boolean becomesStale) {
        this.becomesStale = becomesStale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(Integer productionTime) {
        this.productionTime = productionTime;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
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
    @Override
    public String toString() {
        return "CurrentProduct [revenue=" + revenue + ", collectionTime=" + collectionTime + ", becomesStale=" + becomesStale + ", name=" + name
                + ", productionTime=" + productionTime + ", assetName=" + assetName + ", _class=" + _class + ", additionalProperties="
                + additionalProperties + "]";
    }

}
