package com.ca.mock;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;
import static com.github.tomakehurst.wiremock.client.WireMock.*;

@Service
public class EventMock {/*
        implements ApplicationRunner {
    WireMockServer wireMockServer;


    String EVENT_GET = """
            {
            "eventId": 1;
            "eventName": "test"
            }
            """;

    String USER_GET = """
            {
            "userID": 1;
            "userName": "test"
            }
            """;
    public EventMock(@Autowired WireMockServer wireMockServer) {
        this.wireMockServer = wireMockServer;
    }

    @Override
    public void run(ApplicationArguments args) {
        wireMockServer.stubFor(get(urlEqualTo("/ca/event"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withBody(EVENT_GET)));


        wireMockServer.stubFor(get(urlEqualTo("/ca/user"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withBody(EVENT_GET)));
        ;
    }*/


}
