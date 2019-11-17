package com.lei.controller;

import com.lei.entity.Student;
import com.lei.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    public StudentRepository studentRepository;

    @GetMapping("/findAll")
    public String findAll(Model model){

        Collection<Student> collection=studentRepository.findAll();
        model.addAttribute("collection",collection);
        return "findAll";
    }
    @GetMapping("/findById/{id}")
    public ModelAndView findById(@PathVariable("id") Integer id){
        Student student=studentRepository.findById(id);
        ModelAndView model=new ModelAndView();
        model.addObject("student",student);
        model.setViewName("update");
        return model;

    }
    @GetMapping("/findById")
    public ModelAndView findById2(Integer id){
        Student student=studentRepository.findById(id);
        ModelAndView model=new ModelAndView();
        model.addObject("student",student);
        model.setViewName("findById");
        return model;

    }
    @GetMapping("/update")
    public String update(Student student){
        studentRepository.update(student);
        return "redirect:/student/findAll";
    }

    @GetMapping("/save")
    public String save(Student student){
        studentRepository.save(student);
        return "redirect:/student/findAll";
    }
    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") Integer id){
        studentRepository.deleteById(id);
        return "redirect:/student/findAll";


    }
}
