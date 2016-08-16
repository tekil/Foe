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

public class Entity {

    private Integer id;
    private Integer playerId;
    private String cityentityId;
    private String type;
    private Integer x;
    private Integer y;
    private Integer connected;
    private State state;
    private String _class;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Entity(JSONObject obj) {
        this.id = Utils.setValueInt("id", obj);
        this.playerId = Utils.setValueInt("playerId", obj);
        this.cityentityId = Utils.setValueString("cityentity_id", obj);
        this.type = Utils.setValueString("type", obj);
        this.x = Utils.setValueInt("y", obj);
        this.y = Utils.setValueInt("x", obj);
        this.connected = Utils.setValueInt("connected", obj);
        if (obj.has("state")) {
            this.state = new State(obj.getJSONObject("state"));
        } else {
            this.state = null;
        }
        this._class = Utils.setValueString("__class__", obj);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    @JsonProperty("player_id")
    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getCityentityId() {
        return cityentityId;
    }

    public void setCityentityId(String cityentityId) {
        this.cityentityId = cityentityId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getConnected() {
        return connected;
    }

    public void setConnected(Integer connected) {
        this.connected = connected;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
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
        return "Entity [id=" + id + ", playerId=" + playerId + ", cityentityId=" + cityentityId + ", type=" + type + ", x=" + x + ", y=" + y
                + ", connected=" + connected + ", state=" + state + ", _class=" + _class + ", additionalProperties=" + additionalProperties + "]";
    }
    
}
