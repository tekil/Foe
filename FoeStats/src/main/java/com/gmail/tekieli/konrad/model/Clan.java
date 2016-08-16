
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
    "treasury_id",
    "id",
    "name",
    "description",
    "membersNum",
    "flag",
    "__class__"
})
public class Clan {

    @JsonProperty("treasury_id")
    private Integer treasuryId;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("membersNum")
    private Integer membersNum;
    @JsonProperty("flag")
    private String flag;
    @JsonProperty("__class__")
    private String _class;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The treasuryId
     */
    @JsonProperty("treasury_id")
    public Integer getTreasuryId() {
        return treasuryId;
    }

    /**
     * 
     * @param treasuryId
     *     The treasury_id
     */
    @JsonProperty("treasury_id")
    public void setTreasuryId(Integer treasuryId) {
        this.treasuryId = treasuryId;
    }

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
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The membersNum
     */
    @JsonProperty("membersNum")
    public Integer getMembersNum() {
        return membersNum;
    }

    /**
     * 
     * @param membersNum
     *     The membersNum
     */
    @JsonProperty("membersNum")
    public void setMembersNum(Integer membersNum) {
        this.membersNum = membersNum;
    }

    /**
     * 
     * @return
     *     The flag
     */
    @JsonProperty("flag")
    public String getFlag() {
        return flag;
    }

    /**
     * 
     * @param flag
     *     The flag
     */
    @JsonProperty("flag")
    public void setFlag(String flag) {
        this.flag = flag;
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
