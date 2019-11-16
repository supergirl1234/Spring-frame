package com.lei.controller;

import com.lei.entity.User;
import com.lei.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserHandler {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/findAll")
    public List<User> findAll(){

       return userRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") Integer id){

        return userRepository.findById(id);
    }
    @PostMapping("/save")
    public void save( @RequestBody User  user){
        userRepository.save(user);
    }
    @PostMapping("/update")
    public void update(@RequestBody User  user ){
        userRepository.update(user);
    }
    @GetMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        userRepository.deleteById(id);
    }
}
