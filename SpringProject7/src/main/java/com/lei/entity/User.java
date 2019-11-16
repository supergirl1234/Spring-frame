package com.lei.entity;

import lombok.Data;

@Data
public class User {

    private int id;
    private String name;
    private int age;
    private String address;
    private Grade grade;

    public User(){

        System.out.println("创建User对象");
    }

}
