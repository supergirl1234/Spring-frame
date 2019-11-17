package com.lei.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Student {

    private Integer id;
    private String name;
    private Integer age;
}
