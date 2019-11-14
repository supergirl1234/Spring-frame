package com.lei.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor

public class Student {
    private int id;
    private  String name;
    private  int age;
    private  Address address;

    private List<Address> addressList;


    public Student(){

        System.out.println("创建了Student对像");
    }
}
