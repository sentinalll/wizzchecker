
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
    "outboundFlights",
    "returnFlights",
    "outboundBundles",
    "returnBundles",
    "currencyCode",
    "arrivalStationCurrencyCode",
    "isDomestic",
    "isGroup"
})
public class Response {

    @JsonProperty("outboundFlights")
    private List<OutboundFlight> outboundFlights = new ArrayList<OutboundFlight>();
    @JsonProperty("returnFlights")
    private List<ReturnFlight> returnFlights = new ArrayList<ReturnFlight>();
    @JsonProperty("outboundBundles")
    private List<OutboundBundle> outboundBundles = new ArrayList<OutboundBundle>();
    @JsonProperty("returnBundles")
    private List<ReturnBundle> returnBundles = new ArrayList<ReturnBundle>();
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("arrivalStationCurrencyCode")
    private String arrivalStationCurrencyCode;
    @JsonProperty("isDomestic")
    private boolean isDomestic;
    @JsonProperty("isGroup")
    private boolean isGroup;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("outboundFlights")
    public List<OutboundFlight> getOutboundFlights() {
        return outboundFlights;
    }

    @JsonProperty("outboundFlights")
    public void setOutboundFlights(List<OutboundFlight> outboundFlights) {
        this.outboundFlights = outboundFlights;
    }

    public Response withOutboundFlights(List<OutboundFlight> outboundFlights) {
        this.outboundFlights = outboundFlights;
        return this;
    }

    @JsonProperty("returnFlights")
    public List<ReturnFlight> getReturnFlights() {
        return returnFlights;
    }

    @JsonProperty("returnFlights")
    public void setReturnFlights(List<ReturnFlight> returnFlights) {
        this.returnFlights = returnFlights;
    }

    public Response withReturnFlights(List<ReturnFlight> returnFlights) {
        this.returnFlights = returnFlights;
        return this;
    }

    @JsonProperty("outboundBundles")
    public List<OutboundBundle> getOutboundBundles() {
        return outboundBundles;
    }

    @JsonProperty("outboundBundles")
    public void setOutboundBundles(List<OutboundBundle> outboundBundles) {
        this.outboundBundles = outboundBundles;
    }

    public Response withOutboundBundles(List<OutboundBundle> outboundBundles) {
        this.outboundBundles = outboundBundles;
        return this;
    }

    @JsonProperty("returnBundles")
    public List<ReturnBundle> getReturnBundles() {
        return returnBundles;
    }

    @JsonProperty("returnBundles")
    public void setReturnBundles(List<ReturnBundle> returnBundles) {
        this.returnBundles = returnBundles;
    }

    public Response withReturnBundles(List<ReturnBundle> returnBundles) {
        this.returnBundles = returnBundles;
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

    public Response withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    @JsonProperty("arrivalStationCurrencyCode")
    public String getArrivalStationCurrencyCode() {
        return arrivalStationCurrencyCode;
    }

    @JsonProperty("arrivalStationCurrencyCode")
    public void setArrivalStationCurrencyCode(String arrivalStationCurrencyCode) {
        this.arrivalStationCurrencyCode = arrivalStationCurrencyCode;
    }

    public Response withArrivalStationCurrencyCode(String arrivalStationCurrencyCode) {
        this.arrivalStationCurrencyCode = arrivalStationCurrencyCode;
        return this;
    }

    @JsonProperty("isDomestic")
    public boolean isIsDomestic() {
        return isDomestic;
    }

    @JsonProperty("isDomestic")
    public void setIsDomestic(boolean isDomestic) {
        this.isDomestic = isDomestic;
    }

    public Response withIsDomestic(boolean isDomestic) {
        this.isDomestic = isDomestic;
        return this;
    }

    @JsonProperty("isGroup")
    public boolean isIsGroup() {
        return isGroup;
    }

    @JsonProperty("isGroup")
    public void setIsGroup(boolean isGroup) {
        this.isGroup = isGroup;
    }

    public Response withIsGroup(boolean isGroup) {
        this.isGroup = isGroup;
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

    public Response withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
