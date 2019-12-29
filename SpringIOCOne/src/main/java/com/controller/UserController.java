package com.controller;

import com.po.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.util.Collection;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    public User getUserById(int id){

        return   userService.getUserById(id);
    }
    public Collection<User> getAllUser(){

        return  userService.getAllUser();
    }
}
