
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
    "departureStation",
    "arrivalStation",
    "carrierCode",
    "flightNumber",
    "flightSellKey",
    "departureDateTime",
    "arrivalDateTime",
    "fares",
    "infantLimitExceeded",
    "wheelchairLimitExceeded",
    "oxyLimitExceeded",
    "sportsEquipmentLimitExceeded",
    "isRequest",
    "pie"
})
public class OutboundFlight {

    @JsonProperty("departureStation")
    private String departureStation;
    @JsonProperty("arrivalStation")
    private String arrivalStation;
    @JsonProperty("carrierCode")
    private String carrierCode;
    @JsonProperty("flightNumber")
    private String flightNumber;
    @JsonProperty("flightSellKey")
    private String flightSellKey;
    @JsonProperty("departureDateTime")
    private String departureDateTime;
    @JsonProperty("arrivalDateTime")
    private String arrivalDateTime;
    @JsonProperty("fares")
    private List<Fare> fares = new ArrayList<Fare>();
    @JsonProperty("infantLimitExceeded")
    private InfantLimitExceeded infantLimitExceeded;
    @JsonProperty("wheelchairLimitExceeded")
    private WheelchairLimitExceeded wheelchairLimitExceeded;
    @JsonProperty("oxyLimitExceeded")
    private OxyLimitExceeded oxyLimitExceeded;
    @JsonProperty("sportsEquipmentLimitExceeded")
    private SportsEquipmentLimitExceeded sportsEquipmentLimitExceeded;
    @JsonProperty("isRequest")
    private boolean isRequest;
    @JsonProperty("pie")
    private boolean pie;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("departureStation")
    public String getDepartureStation() {
        return departureStation;
    }

    @JsonProperty("departureStation")
    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public OutboundFlight withDepartureStation(String departureStation) {
        this.departureStation = departureStation;
        return this;
    }

    @JsonProperty("arrivalStation")
    public String getArrivalStation() {
        return arrivalStation;
    }

    @JsonProperty("arrivalStation")
    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public OutboundFlight withArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
        return this;
    }

    @JsonProperty("carrierCode")
    public String getCarrierCode() {
        return carrierCode;
    }

    @JsonProperty("carrierCode")
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public OutboundFlight withCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
        return this;
    }

    @JsonProperty("flightNumber")
    public String getFlightNumber() {
        return flightNumber;
    }

    @JsonProperty("flightNumber")
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public OutboundFlight withFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
        return this;
    }

    @JsonProperty("flightSellKey")
    public String getFlightSellKey() {
        return flightSellKey;
    }

    @JsonProperty("flightSellKey")
    public void setFlightSellKey(String flightSellKey) {
        this.flightSellKey = flightSellKey;
    }

    public OutboundFlight withFlightSellKey(String flightSellKey) {
        this.flightSellKey = flightSellKey;
        return this;
    }

    @JsonProperty("departureDateTime")
    public String getDepartureDateTime() {
        return departureDateTime;
    }

    @JsonProperty("departureDateTime")
    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public OutboundFlight withDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
        return this;
    }

    @JsonProperty("arrivalDateTime")
    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    @JsonProperty("arrivalDateTime")
    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public OutboundFlight withArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
        return this;
    }

    @JsonProperty("fares")
    public List<Fare> getFares() {
        return fares;
    }

    @JsonProperty("fares")
    public void setFares(List<Fare> fares) {
        this.fares = fares;
    }

    public OutboundFlight withFares(List<Fare> fares) {
        this.fares = fares;
        return this;
    }

    @JsonProperty("infantLimitExceeded")
    public InfantLimitExceeded getInfantLimitExceeded() {
        return infantLimitExceeded;
    }

    @JsonProperty("infantLimitExceeded")
    public void setInfantLimitExceeded(InfantLimitExceeded infantLimitExceeded) {
        this.infantLimitExceeded = infantLimitExceeded;
    }

    public OutboundFlight withInfantLimitExceeded(InfantLimitExceeded infantLimitExceeded) {
        this.infantLimitExceeded = infantLimitExceeded;
        return this;
    }

    @JsonProperty("wheelchairLimitExceeded")
    public WheelchairLimitExceeded getWheelchairLimitExceeded() {
        return wheelchairLimitExceeded;
    }

    @JsonProperty("wheelchairLimitExceeded")
    public void setWheelchairLimitExceeded(WheelchairLimitExceeded wheelchairLimitExceeded) {
        this.wheelchairLimitExceeded = wheelchairLimitExceeded;
    }

    public OutboundFlight withWheelchairLimitExceeded(WheelchairLimitExceeded wheelchairLimitExceeded) {
        this.wheelchairLimitExceeded = wheelchairLimitExceeded;
        return this;
    }

    @JsonProperty("oxyLimitExceeded")
    public OxyLimitExceeded getOxyLimitExceeded() {
        return oxyLimitExceeded;
    }

    @JsonProperty("oxyLimitExceeded")
    public void setOxyLimitExceeded(OxyLimitExceeded oxyLimitExceeded) {
        this.oxyLimitExceeded = oxyLimitExceeded;
    }

    public OutboundFlight withOxyLimitExceeded(OxyLimitExceeded oxyLimitExceeded) {
        this.oxyLimitExceeded = oxyLimitExceeded;
        return this;
    }

    @JsonProperty("sportsEquipmentLimitExceeded")
    public SportsEquipmentLimitExceeded getSportsEquipmentLimitExceeded() {
        return sportsEquipmentLimitExceeded;
    }

    @JsonProperty("sportsEquipmentLimitExceeded")
    public void setSportsEquipmentLimitExceeded(SportsEquipmentLimitExceeded sportsEquipmentLimitExceeded) {
        this.sportsEquipmentLimitExceeded = sportsEquipmentLimitExceeded;
    }

    public OutboundFlight withSportsEquipmentLimitExceeded(SportsEquipmentLimitExceeded sportsEquipmentLimitExceeded) {
        this.sportsEquipmentLimitExceeded = sportsEquipmentLimitExceeded;
        return this;
    }

    @JsonProperty("isRequest")
    public boolean isIsRequest() {
        return isRequest;
    }

    @JsonProperty("isRequest")
    public void setIsRequest(boolean isRequest) {
        this.isRequest = isRequest;
    }

    public OutboundFlight withIsRequest(boolean isRequest) {
        this.isRequest = isRequest;
        return this;
    }

    @JsonProperty("pie")
    public boolean isPie() {
        return pie;
    }

    @JsonProperty("pie")
    public void setPie(boolean pie) {
        this.pie = pie;
    }

    public OutboundFlight withPie(boolean pie) {
        this.pie = pie;
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

    public OutboundFlight withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
