
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

public class State {

    private CurrentProduct currentProduct;
    private Boolean boosted;
    private Boolean isMotivated;
    private Long nextStateTransitionIn;
    private String _class;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public State(JSONObject obj) {
        if (obj.has("current_product")) {
            this.currentProduct =  new CurrentProduct(obj.getJSONObject("current_product"));
        }else{
            this.currentProduct =  null;
        }
        this.boosted =  Utils.setValueBoolean("__class__", obj);
        this.isMotivated =  Utils.setValueBoolean("is_motivated", obj);;
        this.nextStateTransitionIn =  Utils.setValueLong("next_state_transition_in", obj);
        this._class = Utils.setValueString("__class__", obj);

    }

    @Override
    public String toString() {
        return "State [currentProduct=" + currentProduct + ", boosted=" + boosted + ", isMotivated=" + isMotivated + ", nextStateTransitionIn="
                + nextStateTransitionIn + ", _class=" + _class + ", additionalProperties=" + additionalProperties + "]";
    }

    public CurrentProduct getCurrentProduct() {
        return currentProduct;
    }

    public void setCurrentProduct(CurrentProduct currentProduct) {
        this.currentProduct = currentProduct;
    }

    public Boolean getBoosted() {
        return boosted;
    }

    public void setBoosted(Boolean boosted) {
        this.boosted = boosted;
    }

    public Boolean getIsMotivated() {
        return isMotivated;
    }

    public void setIsMotivated(Boolean isMotivated) {
        this.isMotivated = isMotivated;
    }

    public Long getNextStateTransitionIn() {
        return nextStateTransitionIn;
    }

    public void setNextStateTransitionIn(Long nextStateTransitionIn) {
        this.nextStateTransitionIn = nextStateTransitionIn;
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
