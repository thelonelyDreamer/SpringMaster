package com.felixwc.spring.netflix.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 23167
 * @description Java is the best language
 * @date 2023/5/26--@21:00
 */
@RequestMapping("/hello")
@RestController
public class HelloController {

    private static final String PROVIDER_URL = "http://provider";

    private final RestTemplate restTemplate;

    public HelloController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/hello")
    public String hello() {
        String result = restTemplate.getForObject(PROVIDER_URL + "/hello/hello", String.class);
        return result;
    }
}
