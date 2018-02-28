package com.wizzchecker.utils;

public class Constants {

    public static final String requestPayload =
            "{\"isFlightChange\":false,\"isSeniorOrStudent\":false,\"flightList\":[{\"departureStation\":\"IEV\",\"arrivalStation\":\"FMM\",\"departureDate\":\"2018-08-05\"},{\"departureStation\":\"FMM\",\"arrivalStation\":\"IEV\",\"departureDate\":\"2018-08-15\"}],\"adultCount\":1,\"childCount\":0,\"infantCount\":0,\"wdc\":true,\"rescueFareCode\":\"\"}";

    public static final String url = "https://be.wizzair.com/7.9.1/Api/search/search";

}
