package com.lei.repository;

import com.lei.entity.User;

import java.util.Collection;


public interface UserRepository {
    public Collection<User> findAll();
    public User findById(Integer id);
    public void update(User user);
    public void deleteById(Integer id);

}
