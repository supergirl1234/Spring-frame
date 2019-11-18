package com.lei.service;

import com.lei.po.User;
import com.lei.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;


    public Collection<User> findAll(){



        return  userRepo.findAll();
    }

    public User findById(Integer id){


        return userRepo.findById(id);

    }



    public void Insert(User user){

        userRepo.Insert(user);

    }

    public void update(User user){

        userRepo.update(user);

    }

    public void deleteById(Integer id){

        userRepo.deleteById(id);

    }


}
