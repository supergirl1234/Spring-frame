package com.lei.controller;

import com.lei.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("index")
public class IndexController {

    @GetMapping("/index")
    public String index(Model model){
        List<Student> list=new ArrayList<>();
        list.add(new Student(1,"张三",11));
        list.add(new Student(2,"李四",12));
        list.add(new Student(3,"王五",13));
        model.addAttribute("list",list);
        return  "index";
    }

    @GetMapping("/index2")
    public ModelAndView index2(Model model){
        List<Student> list=new ArrayList<>();
        list.add(new Student(1,"张三",11));
        list.add(new Student(2,"李四",12));
        list.add(new Student(3,"王五",13));
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("list",list);
        modelAndView.setViewName("index");
        return modelAndView;
    }
    @GetMapping("/index3")
    public String index3(Map<String,List<Student>> map){
        List<Student> list=new ArrayList<>();
        list.add(new Student(1,"张三",11));
        list.add(new Student(2,"李四",12));
        list.add(new Student(3,"王五",13));
       map.put("list",list);
        return  "index";
    }
}
