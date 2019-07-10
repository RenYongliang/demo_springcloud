package com.ryl.demo_consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("DEMO-PROVIDER")
public interface ProviderService {

    @GetMapping("user/getUser")
    String getUser(@RequestParam("list") List<Integer> list);

}
