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
        "isFlightChange",
        "isSeniorOrStudent",
        "flightList",
        "adultCount",
        "childCount",
        "infantCount",
        "wdc",
        "rescueFareCode"
})
public class Request {

    @JsonProperty("isFlightChange")
    private boolean isFlightChange;
    @JsonProperty("isSeniorOrStudent")
    private boolean isSeniorOrStudent;
    @JsonProperty("flightList")
    private List<FlightList> flightList = new ArrayList<>();
    @JsonProperty("adultCount")
    private int adultCount;
    @JsonProperty("childCount")
    private int childCount;
    @JsonProperty("infantCount")
    private int infantCount;
    @JsonProperty("wdc")
    private boolean wdc;
    @JsonProperty("rescueFareCode")
    private String rescueFareCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("isFlightChange")
    public boolean isIsFlightChange() {
        return isFlightChange;
    }

    @JsonProperty("isFlightChange")
    public void setIsFlightChange(boolean isFlightChange) {
        this.isFlightChange = isFlightChange;
    }

    public Request withIsFlightChange(boolean isFlightChange) {
        this.isFlightChange = isFlightChange;
        return this;
    }

    @JsonProperty("isSeniorOrStudent")
    public boolean isIsSeniorOrStudent() {
        return isSeniorOrStudent;
    }

    @JsonProperty("isSeniorOrStudent")
    public void setIsSeniorOrStudent(boolean isSeniorOrStudent) {
        this.isSeniorOrStudent = isSeniorOrStudent;
    }

    public Request withIsSeniorOrStudent(boolean isSeniorOrStudent) {
        this.isSeniorOrStudent = isSeniorOrStudent;
        return this;
    }

    @JsonProperty("flightList")
    public List<FlightList> getFlightList() {
        return flightList;
    }

    @JsonProperty("flightList")
    public void setFlightList(List<FlightList> flightList) {
        this.flightList = flightList;
    }

    public Request withFlightList(List<FlightList> flightList) {
        this.flightList = flightList;
        return this;
    }

    @JsonProperty("adultCount")
    public int getAdultCount() {
        return adultCount;
    }

    @JsonProperty("adultCount")
    public void setAdultCount(int adultCount) {
        this.adultCount = adultCount;
    }

    public Request withAdultCount(int adultCount) {
        this.adultCount = adultCount;
        return this;
    }

    @JsonProperty("childCount")
    public int getChildCount() {
        return childCount;
    }

    @JsonProperty("childCount")
    public void setChildCount(int childCount) {
        this.childCount = childCount;
    }

    public Request withChildCount(int childCount) {
        this.childCount = childCount;
        return this;
    }

    @JsonProperty("infantCount")
    public int getInfantCount() {
        return infantCount;
    }

    @JsonProperty("infantCount")
    public void setInfantCount(int infantCount) {
        this.infantCount = infantCount;
    }

    public Request withInfantCount(int infantCount) {
        this.infantCount = infantCount;
        return this;
    }

    @JsonProperty("wdc")
    public boolean isWdc() {
        return wdc;
    }

    @JsonProperty("wdc")
    public void setWdc(boolean wdc) {
        this.wdc = wdc;
    }

    public Request withWdc(boolean wdc) {
        this.wdc = wdc;
        return this;
    }

    @JsonProperty("rescueFareCode")
    public String getRescueFareCode() {
        return rescueFareCode;
    }

    @JsonProperty("rescueFareCode")
    public void setRescueFareCode(String rescueFareCode) {
        this.rescueFareCode = rescueFareCode;
    }

    public Request withRescueFareCode(String rescueFareCode) {
        this.rescueFareCode = rescueFareCode;
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

    public Request withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}

