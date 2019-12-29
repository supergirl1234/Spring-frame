package com.service;

import com.dao.UserDao;
import com.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    public User getUserById(int id){

        return  userDao.getUserById(id);
    }
    public Collection<User> getAllUser(){

        return  userDao.getAllUser();
    }
}
