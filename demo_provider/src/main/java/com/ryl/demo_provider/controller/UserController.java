package com.ryl.demo_provider.controller;

import com.ryl.demo_provider.entity.User;
import com.ryl.demo_provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private UserService userService;


//    @GetMapping("getUser")
//    public String getUser(@RequestParam("list") List<Integer> list){
//        System.out.println(list.toString());
//        return list.toString();
//    }
//
//    @GetMapping("getUser2")
//    public String getUser2(int[] array){
//        System.out.println(array.toString());
//        return array.toString();
//    }
//
//    @PostMapping("getUser3")
//    public String getUser3(@RequestParam("array") int[] array){
//        System.out.println(array.toString());
//        return array.toString();
//    }

    @PostMapping("/getAll")
    public List<User> getAll(){
        return userService.getAll();
    }
}
