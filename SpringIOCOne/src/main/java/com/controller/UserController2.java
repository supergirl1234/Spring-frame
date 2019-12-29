package com.controller;

import com.po.User;

import com.service.UserService2;

import java.util.Collection;

public class UserController2 {

    private UserService2 userService2;


    public User getUserById(int id){

        return   userService2.getUserById(id);
    }
    public Collection<User> getAllUser(){

        return  userService2.getAllUser();
    }

    public void setUserService2(UserService2 userService2) {
        this.userService2 = userService2;
    }

    public UserService2 getUserService2() {
        return userService2;
    }
}
