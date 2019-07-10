package com.ryl.demo_consumer.controller;

import com.ryl.demo_consumer.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * @author: ryl
 * @description:
 * @date: 2019-04-19 09:06:45
 */
@RestController
@RequestMapping("/consumer")
public class UserController {

    final static String REMOTE_SERVICE_URL = "http://DEMO-PROVIDER";

    @Autowired
    ProviderService providerService;
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getUser")
    public String getUser(){
        List<Integer> list = Arrays.asList(1,2,3);
        return providerService.getUser(list);
    }

    @GetMapping("/getUser2")
    public String getUser2(){
        int[] array = {1,2,3};
        return restTemplate.getForObject(REMOTE_SERVICE_URL+"/user/getUser2?array={array}",String.class,array);
    }

    @PostMapping("/getUser3")
    public String getUser3(){
        int[] array = {1,2,3};
        return restTemplate.postForObject(REMOTE_SERVICE_URL+"/user/getUser2",array,String.class);
    }
}
