
package com.gmail.tekieli.konrad.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "updatedEntities",
    "militaryProducts",
    "__class__"
})
public class ResponseData {

    @JsonProperty("updatedEntities")
    private List<UpdatedEntity> updatedEntities = new ArrayList<UpdatedEntity>();
    @JsonProperty("militaryProducts")
    private List<Object> militaryProducts = new ArrayList<Object>();
    @JsonProperty("__class__")
    private String _class;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The updatedEntities
     */
    @JsonProperty("updatedEntities")
    public List<UpdatedEntity> getUpdatedEntities() {
        return updatedEntities;
    }

    /**
     * 
     * @param updatedEntities
     *     The updatedEntities
     */
    @JsonProperty("updatedEntities")
    public void setUpdatedEntities(List<UpdatedEntity> updatedEntities) {
        this.updatedEntities = updatedEntities;
    }

    /**
     * 
     * @return
     *     The militaryProducts
     */
    @JsonProperty("militaryProducts")
    public List<Object> getMilitaryProducts() {
        return militaryProducts;
    }

    /**
     * 
     * @param militaryProducts
     *     The militaryProducts
     */
    @JsonProperty("militaryProducts")
    public void setMilitaryProducts(List<Object> militaryProducts) {
        this.militaryProducts = militaryProducts;
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
