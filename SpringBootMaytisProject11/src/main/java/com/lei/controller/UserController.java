package com.lei.controller;

import com.lei.repository.UserRepo;

import com.lei.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/findAll")
    public ModelAndView findAll(){

        Collection<User> collection=userRepo.findAll();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("collection",collection);
        modelAndView.setViewName("showAll");
        return  modelAndView;
    }
    @GetMapping("/findById/{id}")
    public String findById(@PathVariable("id") Integer id,Model model){

        User user=userRepo.findById(id);
        model.addAttribute("user",user);

        return "update";

    }
    @GetMapping("/findById")
    public ModelAndView findById2(Integer id){

        User user=userRepo.findById(id);
        ModelAndView model=new ModelAndView();
        model.addObject("user",user);
        model.setViewName("findById");

        return model;

    }

    @GetMapping("/insert")
    public String Insert(User user){

        userRepo.Insert(user);
        return "redirect:/user/findAll";
    }
    @GetMapping("/update")
    public String update(User user){

        userRepo.update(user);
        return "redirect:/user/findAll";
    }
    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") Integer id){

        userRepo.deleteById(id);
        return "redirect:/user/findAll";
    }


}
