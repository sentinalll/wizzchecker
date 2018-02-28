
package com.wizzchecker.dto;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "unavailableCount",
    "limitExceeded",
    "isBlocking"
})
public class SportsEquipmentLimitExceeded {

    @JsonProperty("unavailableCount")
    private int unavailableCount;
    @JsonProperty("limitExceeded")
    private boolean limitExceeded;
    @JsonProperty("isBlocking")
    private boolean isBlocking;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("unavailableCount")
    public int getUnavailableCount() {
        return unavailableCount;
    }

    @JsonProperty("unavailableCount")
    public void setUnavailableCount(int unavailableCount) {
        this.unavailableCount = unavailableCount;
    }

    public SportsEquipmentLimitExceeded withUnavailableCount(int unavailableCount) {
        this.unavailableCount = unavailableCount;
        return this;
    }

    @JsonProperty("limitExceeded")
    public boolean isLimitExceeded() {
        return limitExceeded;
    }

    @JsonProperty("limitExceeded")
    public void setLimitExceeded(boolean limitExceeded) {
        this.limitExceeded = limitExceeded;
    }

    public SportsEquipmentLimitExceeded withLimitExceeded(boolean limitExceeded) {
        this.limitExceeded = limitExceeded;
        return this;
    }

    @JsonProperty("isBlocking")
    public boolean isIsBlocking() {
        return isBlocking;
    }

    @JsonProperty("isBlocking")
    public void setIsBlocking(boolean isBlocking) {
        this.isBlocking = isBlocking;
    }

    public SportsEquipmentLimitExceeded withIsBlocking(boolean isBlocking) {
        this.isBlocking = isBlocking;
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

    public SportsEquipmentLimitExceeded withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
