package com.pond.build.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class NacosClientController {

    @Autowired
    private ProviderFeign providerFeign;

    @GetMapping("/test")
    public String test() {
        return providerFeign.invoke();

    }


//    @GetMapping("/test")
//    public String test1() {
//        return providerFeign.invoke();
//
//    }

}

@FeignClient("fishNacos-8070")
interface ProviderFeign {

    @GetMapping("invoke")
    String invoke();


//    @GetMapping("invoke")
//    String invoke();

}
