package com.lei;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class Controller {

    @Autowired
    public Person person;

    @RequestMapping("/getPerson")
    public String getPerson(){

        return person.toString();
    }

    @Autowired
    public  Student student;
    @RequestMapping("/getStudent")
    public String getStudent(){

        return student.toString();
    }
}
