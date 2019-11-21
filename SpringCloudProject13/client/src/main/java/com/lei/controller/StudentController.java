package com.lei.controller;

import com.lei.po.Student;
import com.lei.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

@Controller
@RequestMapping("student")
public class StudentController {


    @Autowired
    public StudentRepository studentRepository;

    @Value("${server.port}")
    private String port;


    @GetMapping("/findAll")
    public String findAll(Model model){

       Collection<Student> collection= studentRepository.findAll();
        model.addAttribute("collection",collection);
        return "AllInformation";

    }
    @GetMapping("/findById/{id}")
    public ModelAndView findById(@PathVariable("id") Integer id){


        ModelAndView modelAndView=new ModelAndView();
        Student student=studentRepository.findById(id);
        modelAndView.addObject("student",student);
        modelAndView.setViewName("update");
        return modelAndView;
    }
    @GetMapping("/findById")
    public ModelAndView findById2(Integer id){


        ModelAndView modelAndView=new ModelAndView();
        Student student=studentRepository.findById(id);
        modelAndView.addObject("student",student);
        modelAndView.setViewName("findById");
        return  modelAndView;
    }
    @GetMapping("/update")
    public String update(Student student){

        studentRepository.update(student);
        return "redirect:/student/findAll";
    }
    @GetMapping("/insert")
    public String Insert(Student student){

        studentRepository.Insert(student);
        return "redirect:/student/findAll";
    }
    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id")Integer id){

        studentRepository.deleteById(id);
        return "redirect:/student/findAll";
    }
    @GetMapping("/index")
    @ResponseBody
    public String index(){
        return this.port;
    }
}
