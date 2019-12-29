package com.service;

import com.dao.UserDao2;
import com.dao.UserDaoImpl2;
import com.po.User;

import java.util.Collection;

public class UserService2 {

    private UserDaoImpl2 userDao2;


    public User getUserById(int id){

        return  userDao2.getUserById(id);
    }
    public Collection<User> getAllUser(){

        return  userDao2.getAllUser();
    }

    public void setUserDao2(UserDaoImpl2 userDao2) {
        this.userDao2 = userDao2;
    }

    public UserDaoImpl2 getUserDao2() {
        return userDao2;
    }
}
