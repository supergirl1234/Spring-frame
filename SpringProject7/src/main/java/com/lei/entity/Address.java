package com.lei.entity;

import lombok.Data;

@Data
public class Address {

    public String address;

    public Address() {
        System.out.println("创建了Address对象");
    }
}
