package com.lei;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Student {

    @Value("Tom")
    public String name;
    @Value("12")
    public Integer age;

}
