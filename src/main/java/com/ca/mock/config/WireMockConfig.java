package com.ca.mock.config;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.common.ClasspathFileSource;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URL;

@Configuration
public class WireMockConfig {

    @Bean(initMethod = "start", destroyMethod = "stop")
    public WireMockServer wireMockServer() {
                    return new WireMockServer(
                        WireMockConfiguration.
                                options()
                                .port(8082)
                                .usingFilesUnderClasspath("BOOT-INF/classes/mappings")
                );
    }
}
