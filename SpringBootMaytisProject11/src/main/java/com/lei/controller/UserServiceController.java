package com.lei.controller;

import com.lei.po.User;
import com.lei.repository.UserRepo;
import com.lei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

@Controller
@RequestMapping("/userService")
public class UserServiceController {


    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public ModelAndView findAll(){

        Collection<User> collection=userService.findAll();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("collection",collection);
        modelAndView.setViewName("showAll");
        return  modelAndView;
    }
    @GetMapping("/findById/{id}")
    public String findById(@PathVariable("id") Integer id, Model model){

        User user=userService.findById(id);
        model.addAttribute("user",user);

        return "update";

    }
    @GetMapping("/findById")
    public ModelAndView findById2(Integer id){

        User user=userService.findById(id);
        ModelAndView model=new ModelAndView();
        model.addObject("user",user);
        model.setViewName("findById");

        return model;

    }

    @GetMapping("/insert")
    public String Insert(User user){

        userService.Insert(user);
        return "redirect:/userService/findAll";
    }
    @GetMapping("/update")
    public String update(User user){

        userService.update(user);
        return "redirect:/userService/findAll";
    }
    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") Integer id){

        userService.deleteById(id);
        return "redirect:/userService/findAll";
    }
}
