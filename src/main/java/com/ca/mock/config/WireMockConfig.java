package com.ca.mock.config;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URL;

@Configuration
public class WireMockConfig {

    @Bean(initMethod = "start", destroyMethod = "stop")
    public WireMockServer wireMockServer() {
      System.out.println(System.getProperty("java.class.path"));
        ClassLoader classLoader = getClass().getClassLoader();
        URL file = classLoader.getResource(".");
        System.out.println("Path::::::"+ file.getPath());
        if (file == null) {
            throw new RuntimeException("wiremock resource not found in classpath");
        }
                return new WireMockServer(
                        WireMockConfiguration.
                                options()
                                .port(8082)
                                .usingFilesUnderClasspath(file.getPath()));
    }
}
