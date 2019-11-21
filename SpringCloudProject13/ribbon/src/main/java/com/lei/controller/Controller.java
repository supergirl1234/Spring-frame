package com.lei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/FinalController")
public class Controller {

    @Autowired
    public RestTemplate restTemplate;

    @GetMapping("/findAll")
    public  String findAll(){

        return restTemplate.getForObject("http://provider/student/findAll",String.class);
    }
}
