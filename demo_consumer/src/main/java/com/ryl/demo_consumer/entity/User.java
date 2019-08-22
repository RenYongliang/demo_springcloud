package com.ryl.demo_consumer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: ryl
 * @description:
 * @date: 2019-08-22 20:32:45
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name;

    private Integer age;
}
