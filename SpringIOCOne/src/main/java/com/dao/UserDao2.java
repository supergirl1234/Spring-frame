package com.dao;

import com.po.User;

import java.util.Collection;

public interface UserDao2 {

    public User getUserById(int id);
    public Collection<User> getAllUser();
}
