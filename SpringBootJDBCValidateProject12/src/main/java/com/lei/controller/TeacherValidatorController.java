package com.lei.controller;

import com.lei.po.Teacher;
import com.lei.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.lang.annotation.Annotation;
import java.util.List;


@RestController
@RequestMapping("/teacher")
public class TeacherValidatorController {

    @GetMapping("/validator")
    public String validator(@Valid Teacher teacher, BindingResult bindingResult){
        if(bindingResult.hasErrors()){

            List<ObjectError> list=bindingResult.getAllErrors();
            for(ObjectError item:list){

                System.out.println(item.getCode()+"-"+item.getDefaultMessage());
            }

        }
        return "已检验";

    }
}
