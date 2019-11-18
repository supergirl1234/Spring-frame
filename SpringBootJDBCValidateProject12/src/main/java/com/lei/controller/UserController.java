package com.lei.controller;

import com.lei.po.User;
import com.lei.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;


@Controller
@RequestMapping("/userController")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll")
    public ModelAndView findAll() {

        Collection<User> collection=userRepository.findAll();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("collection",collection);
        modelAndView.setViewName("showAll");
        return modelAndView;
    }

    @GetMapping("/findById/{id}")
    public ModelAndView findById(@PathVariable("id") Integer id) {

        User user=userRepository.findById(id);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("user",user);
        modelAndView.setViewName("update");
        return modelAndView;
    }
    @GetMapping("/findById")
    public ModelAndView findById2(Integer id) {

        User user=userRepository.findById(id);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("user",user);
        modelAndView.setViewName("findById");
        return modelAndView;
    }

    @GetMapping("/insert")
    public String Insert(User user) {
        userRepository.Insert(user);
        return "redirect:/userController/findAll";
    }

    @GetMapping("/update")
    public String update(User user) {
        userRepository.update(user);
        return "redirect:/userController/findAll";
    }

    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") Integer id) {
        userRepository.deleteById(id);
        return "redirect:/userController/findAll";
    }


}
