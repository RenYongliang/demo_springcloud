package com.ryl.demo_consumer.mapper;


import com.ryl.demo_consumer.entity.User;

import java.util.List;

/**
 * @author: ryl
 * @description:
 * @date: 2019-08-22 20:36:06
 */
public interface UserMapper {

    List<User> getAllUser();

    int insertUser(User user);

}
