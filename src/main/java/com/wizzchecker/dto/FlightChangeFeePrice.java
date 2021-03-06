
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
    "code",
    "amount",
    "currencyCode"
})
public class FlightChangeFeePrice {

    @JsonProperty("code")
    private Object code;
    @JsonProperty("amount")
    private float amount;
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("code")
    public Object getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(Object code) {
        this.code = code;
    }

    public FlightChangeFeePrice withCode(Object code) {
        this.code = code;
        return this;
    }

    @JsonProperty("amount")
    public float getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(float amount) {
        this.amount = amount;
    }

    public FlightChangeFeePrice withAmount(float amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public FlightChangeFeePrice withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
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

    public FlightChangeFeePrice withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
