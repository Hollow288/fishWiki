package com.pond.build;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
//实现服务注册
@EnableDiscoveryClient
//开启hystrix支持
@EnableHystrix
public class FishNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(FishNacosApplication.class, args);
    }

}

