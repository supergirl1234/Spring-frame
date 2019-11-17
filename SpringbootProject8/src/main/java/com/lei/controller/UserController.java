package com.lei.controller;

import com.lei.entity.User;
import com.lei.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserRepositoryImpl userRepository;


    @RequestMapping("/findAll")
    public Collection<User> findAll() {

        return userRepository.findAll();
    }

    /*@RequestMapping("/findById/{id}")
    public User findById(@PathVariable("id") Integer id) {

        return userRepository.findById(id);

    }

    @RequestMapping("/update")
    public void update(@RequestBody User user) {

        userRepository.update(user);

    }


    @RequestMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id) {

        userRepository.deleteById(id);

    }
*/
}
