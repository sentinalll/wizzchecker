
package com.wizzchecker.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "ancillaryServices",
    "fareLockFeeCode"
})
public class OutboundBundle {

    @JsonProperty("code")
    private String code;
    @JsonProperty("ancillaryServices")
    private List<String> ancillaryServices = new ArrayList<String>();
    @JsonProperty("fareLockFeeCode")
    private String fareLockFeeCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public OutboundBundle withCode(String code) {
        this.code = code;
        return this;
    }

    @JsonProperty("ancillaryServices")
    public List<String> getAncillaryServices() {
        return ancillaryServices;
    }

    @JsonProperty("ancillaryServices")
    public void setAncillaryServices(List<String> ancillaryServices) {
        this.ancillaryServices = ancillaryServices;
    }

    public OutboundBundle withAncillaryServices(List<String> ancillaryServices) {
        this.ancillaryServices = ancillaryServices;
        return this;
    }

    @JsonProperty("fareLockFeeCode")
    public String getFareLockFeeCode() {
        return fareLockFeeCode;
    }

    @JsonProperty("fareLockFeeCode")
    public void setFareLockFeeCode(String fareLockFeeCode) {
        this.fareLockFeeCode = fareLockFeeCode;
    }

    public OutboundBundle withFareLockFeeCode(String fareLockFeeCode) {
        this.fareLockFeeCode = fareLockFeeCode;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public OutboundBundle withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
