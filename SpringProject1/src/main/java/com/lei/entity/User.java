package com.lei.entity;

import lombok.Data;

import java.util.List;

@Data
public class User {

    private int id;
    private String name;
    private int age;
    private Address address;
    private List<String> addressList;

    public User() {

        System.out.println("创建了User对象");
    }
}
