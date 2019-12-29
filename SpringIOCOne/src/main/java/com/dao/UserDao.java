package com.dao;

import com.po.User;
import java.util.Collection;

public interface UserDao {

    public User getUserById(int id);
    public Collection<User> getAllUser();

}
