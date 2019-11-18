package com.lei.repository;

import com.lei.po.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UserRepo {

    public Collection<User> findAll();
    public User findById(Integer id);
    public void Insert(User user);
    public void update(User user);
    public void deleteById(Integer id);
}