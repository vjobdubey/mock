package com.ca.mock;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CorporateActionMockApplication {
	WireMockServer mockServer;
	public static void main(String[] args) {
		SpringApplication.run(CorporateActionMockApplication.class, args);

	}


}
