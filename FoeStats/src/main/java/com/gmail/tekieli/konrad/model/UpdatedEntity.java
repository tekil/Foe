
package com.gmail.tekieli.konrad.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "player_id",
    "cityentity_id",
    "type",
    "x",
    "y",
    "connected",
    "state",
    "level",
    "__class__"
})
public class UpdatedEntity {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("player_id")
    private Integer playerId;
    @JsonProperty("cityentity_id")
    private String cityentityId;
    @JsonProperty("type")
    private String type;
    @JsonProperty("x")
    private Integer x;
    @JsonProperty("y")
    private Integer y;
    @JsonProperty("connected")
    private Integer connected;
    @JsonProperty("state")
    private State state;
    @JsonProperty("level")
    private Integer level;
    @JsonProperty("__class__")
    private String _class;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The playerId
     */
    @JsonProperty("player_id")
    public Integer getPlayerId() {
        return playerId;
    }

    /**
     * 
     * @param playerId
     *     The player_id
     */
    @JsonProperty("player_id")
    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    /**
     * 
     * @return
     *     The cityentityId
     */
    @JsonProperty("cityentity_id")
    public String getCityentityId() {
        return cityentityId;
    }

    /**
     * 
     * @param cityentityId
     *     The cityentity_id
     */
    @JsonProperty("cityentity_id")
    public void setCityentityId(String cityentityId) {
        this.cityentityId = cityentityId;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The x
     */
    @JsonProperty("x")
    public Integer getX() {
        return x;
    }

    /**
     * 
     * @param x
     *     The x
     */
    @JsonProperty("x")
    public void setX(Integer x) {
        this.x = x;
    }

    /**
     * 
     * @return
     *     The y
     */
    @JsonProperty("y")
    public Integer getY() {
        return y;
    }

    /**
     * 
     * @param y
     *     The y
     */
    @JsonProperty("y")
    public void setY(Integer y) {
        this.y = y;
    }

    /**
     * 
     * @return
     *     The connected
     */
    @JsonProperty("connected")
    public Integer getConnected() {
        return connected;
    }

    /**
     * 
     * @param connected
     *     The connected
     */
    @JsonProperty("connected")
    public void setConnected(Integer connected) {
        this.connected = connected;
    }

    /**
     * 
     * @return
     *     The state
     */
    @JsonProperty("state")
    public State getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(State state) {
        this.state = state;
    }

    /**
     * 
     * @return
     *     The level
     */
    @JsonProperty("level")
    public Integer getLevel() {
        return level;
    }

    /**
     * 
     * @param level
     *     The level
     */
    @JsonProperty("level")
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 
     * @return
     *     The _class
     */
    @JsonProperty("__class__")
    public String getClass_() {
        return _class;
    }

    /**
     * 
     * @param _class
     *     The __class__
     */
    @JsonProperty("__class__")
    public void setClass_(String _class) {
        this._class = _class;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
