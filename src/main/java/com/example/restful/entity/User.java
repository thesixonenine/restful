package com.example.restful.entity;

import lombok.*;

/**
 * @author simple
 * @version 1.0
 * @date 2018/7/4 17:21
 */
@Setter
@Getter
@ToString
@Builder
public class User {
    private Long id;
    private String name;
    private Integer age;
}
