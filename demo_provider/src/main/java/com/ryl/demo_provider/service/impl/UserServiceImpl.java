package com.ryl.demo_provider.service.impl;

import com.ryl.demo_provider.entity.User;
import com.ryl.demo_provider.mapper.UserMapper;
import com.ryl.demo_provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: ryl
 * @description:
 * @date: 2019-04-19 09:00:14
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> getAll() {
        return userMapper.getAllUser();
    }

}
