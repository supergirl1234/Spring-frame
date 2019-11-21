package com.lei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lei.repository")
public class ClientApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication2.class,args);
    }
}
