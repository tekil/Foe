
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
    "responseData",
    "requestClass",
    "requestMethod",
    "requestId",
    "__class__"
})
public class Example {

    @JsonProperty("responseData")
    private ResponseData responseData;
    @JsonProperty("requestClass")
    private String requestClass;
    @JsonProperty("requestMethod")
    private String requestMethod;
    @JsonProperty("requestId")
    private Integer requestId;
    @JsonProperty("__class__")
    private String _class;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The responseData
     */
    @JsonProperty("responseData")
    public ResponseData getResponseData() {
        return responseData;
    }

    /**
     * 
     * @param responseData
     *     The responseData
     */
    @JsonProperty("responseData")
    public void setResponseData(ResponseData responseData) {
        this.responseData = responseData;
    }

    /**
     * 
     * @return
     *     The requestClass
     */
    @JsonProperty("requestClass")
    public String getRequestClass() {
        return requestClass;
    }

    /**
     * 
     * @param requestClass
     *     The requestClass
     */
    @JsonProperty("requestClass")
    public void setRequestClass(String requestClass) {
        this.requestClass = requestClass;
    }

    /**
     * 
     * @return
     *     The requestMethod
     */
    @JsonProperty("requestMethod")
    public String getRequestMethod() {
        return requestMethod;
    }

    /**
     * 
     * @param requestMethod
     *     The requestMethod
     */
    @JsonProperty("requestMethod")
    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    /**
     * 
     * @return
     *     The requestId
     */
    @JsonProperty("requestId")
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * 
     * @param requestId
     *     The requestId
     */
    @JsonProperty("requestId")
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
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
