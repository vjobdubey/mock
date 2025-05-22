package com.ca.mock;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CorporateActionMockApplication {
	WireMockServer mockServer;
	public static void main(String[] args) {
		//Comment out the below line to disable the mock server
		SpringApplication.run(CorporateActionMockApplication.class, args);

	}


}
