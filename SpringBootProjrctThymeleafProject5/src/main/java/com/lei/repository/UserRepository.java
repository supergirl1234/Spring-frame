package com.lei.repository;

import com.lei.entity.Student;
import com.lei.entity.User;

import java.util.List;

public interface UserRepository {

    public List<User> findAll();
    public User findById(Integer id);
    public void save(User  user);
    public void update(User  user );
    public void deleteById(Integer id);

}
