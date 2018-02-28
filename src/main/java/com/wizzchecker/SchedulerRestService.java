package com.wizzchecker;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wizzchecker.dto.Fare;
import com.wizzchecker.dto.FullBasePrice;
import com.wizzchecker.dto.Request;
import com.wizzchecker.dto.Response;
import com.wizzchecker.utils.Constants;
import java.io.IOException;
import java.util.OptionalInt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SchedulerRestService {

    private static final Logger log = LoggerFactory.getLogger(SchedulerRestService.class);

    private ObjectMapper mapper =
            new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    private RestTemplate restTemplate;

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Scheduled(fixedRate = 3600000)
    public void checkTicketsPrice() throws IOException {
        log.info("Check ticket price");

        Request request = mapper.readValue(Constants.requestPayload, Request.class);

        log.info("Send request {} ", mapper.writeValueAsString(request));

        ResponseEntity<Response> responseEntity =
                restTemplate.postForEntity(Constants.url, request, Response.class);

        log.info("Retrieved response with status code {}", responseEntity.getStatusCodeValue());
        Response response = responseEntity.getBody();
        log.info("Retrieved response {}", mapper.writeValueAsString(response));

        OptionalInt outboundFlightPrice = response.getOutboundFlights()
                .get(0)
                .getFares()
                .stream()
                .filter(f -> f.getBundle().equals("BASIC"))
                .map(Fare::getFullBasePrice)
                .mapToInt(FullBasePrice::getAmount)
                .max();

        OptionalInt returnFlightPrice = response.getReturnFlights()
                .get(0)
                .getFares()
                .stream()
                .filter(f -> f.getBundle().equals("BASIC"))
                .map(Fare::getFullBasePrice)
                .mapToInt(FullBasePrice::getAmount)
                .max();

        log.info("Outbound Flight Price: {} UAH, Return Flight Price: {} UAH",
                outboundFlightPrice.orElse(0),
                returnFlightPrice.orElse(0));

    }
}
