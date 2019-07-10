package com.ryl.demo_provider.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: ryl
 * @description:
 * @date: 2019-04-19 08:59:20
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("getUser")
    public String getUser(@RequestParam("list") List<Integer> list){
        System.out.println(list.toString());
        return list.toString();
    }

    @GetMapping("getUser2")
    public String getUser2(int[] array){
        System.out.println(array.toString());
        return array.toString();
    }

    @PostMapping("getUser3")
    public String getUser3(@RequestParam("array") int[] array){
        System.out.println(array.toString());
        return array.toString();
    }
}
