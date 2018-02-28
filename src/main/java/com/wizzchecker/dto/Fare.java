
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
    "fareSellKey",
    "administrationFeePrice",
    "basePrice",
    "discountedPrice",
    "fullBasePrice",
    "discountedFarePrice",
    "discountedPriceWithoutFamilyDiscount",
    "flightChangeFeePrice",
    "fareLockPrice",
    "bundle",
    "fareDiscountType",
    "wdc",
    "availableCount",
    "distributionFeePrice",
    "isFamily"
})
public class Fare {

    @JsonProperty("fareSellKey")
    private String fareSellKey;
    @JsonProperty("administrationFeePrice")
    private AdministrationFeePrice administrationFeePrice;
    @JsonProperty("basePrice")
    private BasePrice basePrice;
    @JsonProperty("discountedPrice")
    private DiscountedPrice discountedPrice;
    @JsonProperty("fullBasePrice")
    private FullBasePrice fullBasePrice;
    @JsonProperty("discountedFarePrice")
    private DiscountedFarePrice discountedFarePrice;
    @JsonProperty("discountedPriceWithoutFamilyDiscount")
    private DiscountedPriceWithoutFamilyDiscount discountedPriceWithoutFamilyDiscount;
    @JsonProperty("flightChangeFeePrice")
    private FlightChangeFeePrice flightChangeFeePrice;
    @JsonProperty("fareLockPrice")
    private FareLockPrice fareLockPrice;
    @JsonProperty("bundle")
    private String bundle;
    @JsonProperty("fareDiscountType")
    private String fareDiscountType;
    @JsonProperty("wdc")
    private boolean wdc;
    @JsonProperty("availableCount")
    private int availableCount;
    @JsonProperty("distributionFeePrice")
    private DistributionFeePrice distributionFeePrice;
    @JsonProperty("isFamily")
    private boolean isFamily;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fareSellKey")
    public String getFareSellKey() {
        return fareSellKey;
    }

    @JsonProperty("fareSellKey")
    public void setFareSellKey(String fareSellKey) {
        this.fareSellKey = fareSellKey;
    }

    public Fare withFareSellKey(String fareSellKey) {
        this.fareSellKey = fareSellKey;
        return this;
    }

    @JsonProperty("administrationFeePrice")
    public AdministrationFeePrice getAdministrationFeePrice() {
        return administrationFeePrice;
    }

    @JsonProperty("administrationFeePrice")
    public void setAdministrationFeePrice(AdministrationFeePrice administrationFeePrice) {
        this.administrationFeePrice = administrationFeePrice;
    }

    public Fare withAdministrationFeePrice(AdministrationFeePrice administrationFeePrice) {
        this.administrationFeePrice = administrationFeePrice;
        return this;
    }

    @JsonProperty("basePrice")
    public BasePrice getBasePrice() {
        return basePrice;
    }

    @JsonProperty("basePrice")
    public void setBasePrice(BasePrice basePrice) {
        this.basePrice = basePrice;
    }

    public Fare withBasePrice(BasePrice basePrice) {
        this.basePrice = basePrice;
        return this;
    }

    @JsonProperty("discountedPrice")
    public DiscountedPrice getDiscountedPrice() {
        return discountedPrice;
    }

    @JsonProperty("discountedPrice")
    public void setDiscountedPrice(DiscountedPrice discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public Fare withDiscountedPrice(DiscountedPrice discountedPrice) {
        this.discountedPrice = discountedPrice;
        return this;
    }

    @JsonProperty("fullBasePrice")
    public FullBasePrice getFullBasePrice() {
        return fullBasePrice;
    }

    @JsonProperty("fullBasePrice")
    public void setFullBasePrice(FullBasePrice fullBasePrice) {
        this.fullBasePrice = fullBasePrice;
    }

    public Fare withFullBasePrice(FullBasePrice fullBasePrice) {
        this.fullBasePrice = fullBasePrice;
        return this;
    }

    @JsonProperty("discountedFarePrice")
    public DiscountedFarePrice getDiscountedFarePrice() {
        return discountedFarePrice;
    }

    @JsonProperty("discountedFarePrice")
    public void setDiscountedFarePrice(DiscountedFarePrice discountedFarePrice) {
        this.discountedFarePrice = discountedFarePrice;
    }

    public Fare withDiscountedFarePrice(DiscountedFarePrice discountedFarePrice) {
        this.discountedFarePrice = discountedFarePrice;
        return this;
    }

    @JsonProperty("discountedPriceWithoutFamilyDiscount")
    public DiscountedPriceWithoutFamilyDiscount getDiscountedPriceWithoutFamilyDiscount() {
        return discountedPriceWithoutFamilyDiscount;
    }

    @JsonProperty("discountedPriceWithoutFamilyDiscount")
    public void setDiscountedPriceWithoutFamilyDiscount(DiscountedPriceWithoutFamilyDiscount discountedPriceWithoutFamilyDiscount) {
        this.discountedPriceWithoutFamilyDiscount = discountedPriceWithoutFamilyDiscount;
    }

    public Fare withDiscountedPriceWithoutFamilyDiscount(DiscountedPriceWithoutFamilyDiscount discountedPriceWithoutFamilyDiscount) {
        this.discountedPriceWithoutFamilyDiscount = discountedPriceWithoutFamilyDiscount;
        return this;
    }

    @JsonProperty("flightChangeFeePrice")
    public FlightChangeFeePrice getFlightChangeFeePrice() {
        return flightChangeFeePrice;
    }

    @JsonProperty("flightChangeFeePrice")
    public void setFlightChangeFeePrice(FlightChangeFeePrice flightChangeFeePrice) {
        this.flightChangeFeePrice = flightChangeFeePrice;
    }

    public Fare withFlightChangeFeePrice(FlightChangeFeePrice flightChangeFeePrice) {
        this.flightChangeFeePrice = flightChangeFeePrice;
        return this;
    }

    @JsonProperty("fareLockPrice")
    public FareLockPrice getFareLockPrice() {
        return fareLockPrice;
    }

    @JsonProperty("fareLockPrice")
    public void setFareLockPrice(FareLockPrice fareLockPrice) {
        this.fareLockPrice = fareLockPrice;
    }

    public Fare withFareLockPrice(FareLockPrice fareLockPrice) {
        this.fareLockPrice = fareLockPrice;
        return this;
    }

    @JsonProperty("bundle")
    public String getBundle() {
        return bundle;
    }

    @JsonProperty("bundle")
    public void setBundle(String bundle) {
        this.bundle = bundle;
    }

    public Fare withBundle(String bundle) {
        this.bundle = bundle;
        return this;
    }

    @JsonProperty("fareDiscountType")
    public String getFareDiscountType() {
        return fareDiscountType;
    }

    @JsonProperty("fareDiscountType")
    public void setFareDiscountType(String fareDiscountType) {
        this.fareDiscountType = fareDiscountType;
    }

    public Fare withFareDiscountType(String fareDiscountType) {
        this.fareDiscountType = fareDiscountType;
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

    public Fare withWdc(boolean wdc) {
        this.wdc = wdc;
        return this;
    }

    @JsonProperty("availableCount")
    public int getAvailableCount() {
        return availableCount;
    }

    @JsonProperty("availableCount")
    public void setAvailableCount(int availableCount) {
        this.availableCount = availableCount;
    }

    public Fare withAvailableCount(int availableCount) {
        this.availableCount = availableCount;
        return this;
    }

    @JsonProperty("distributionFeePrice")
    public DistributionFeePrice getDistributionFeePrice() {
        return distributionFeePrice;
    }

    @JsonProperty("distributionFeePrice")
    public void setDistributionFeePrice(DistributionFeePrice distributionFeePrice) {
        this.distributionFeePrice = distributionFeePrice;
    }

    public Fare withDistributionFeePrice(DistributionFeePrice distributionFeePrice) {
        this.distributionFeePrice = distributionFeePrice;
        return this;
    }

    @JsonProperty("isFamily")
    public boolean isIsFamily() {
        return isFamily;
    }

    @JsonProperty("isFamily")
    public void setIsFamily(boolean isFamily) {
        this.isFamily = isFamily;
    }

    public Fare withIsFamily(boolean isFamily) {
        this.isFamily = isFamily;
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

    public Fare withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
