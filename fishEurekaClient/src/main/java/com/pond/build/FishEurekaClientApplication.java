package com.pond.build;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableDiscoveryClient
@EnableWebSecurity
public class FishEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(FishEurekaClientApplication.class, args);
    }

}
