package com.ryl.demo_consumer.service.impl;

import com.ryl.demo_consumer.entity.User;
import com.ryl.demo_consumer.mapper.UserMapper;
import com.ryl.demo_consumer.service.ProviderService;
import com.ryl.demo_consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: ryl
 * @description:
 * @date: 2019-08-22 20:52:15
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ProviderService providerService;

    @Override
    @Transactional
    public void testIsolation() {
        List<User> users = userMapper.getAllUser();
        System.out.println(users.size());
        User user = new User("wangwu",19);
        userMapper.insertUser(user);
        List<User> self = userMapper.getAllUser();
        System.out.println(self.size());
        List<User> other = providerService.getAll();
        System.out.println(other.size());

    }
}
