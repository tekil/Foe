
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
    "offers",
    "needs",
    "__class__"
})
public class TradeProfile {

    @JsonProperty("offers")
    private List<Object> offers = new ArrayList<Object>();
    @JsonProperty("needs")
    private List<Object> needs = new ArrayList<Object>();
    @JsonProperty("__class__")
    private String _class;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The offers
     */
    @JsonProperty("offers")
    public List<Object> getOffers() {
        return offers;
    }

    /**
     * 
     * @param offers
     *     The offers
     */
    @JsonProperty("offers")
    public void setOffers(List<Object> offers) {
        this.offers = offers;
    }

    /**
     * 
     * @return
     *     The needs
     */
    @JsonProperty("needs")
    public List<Object> getNeeds() {
        return needs;
    }

    /**
     * 
     * @param needs
     *     The needs
     */
    @JsonProperty("needs")
    public void setNeeds(List<Object> needs) {
        this.needs = needs;
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
