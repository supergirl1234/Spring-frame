package com.lei.controller;

import com.lei.po.Student;
import com.lei.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/findAll")
    public List<Student> findAll(){

        return studentRepository.findAll();
    }
    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Integer id){

        return studentRepository.getById(id);
    }

    @GetMapping("/save")
    public Student save(@RequestBody Student student){

        return studentRepository.save(student);
    }
    @GetMapping("/update")
    public Student update(@RequestBody Student student){

        return studentRepository.save(student);
    }

    @GetMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){

         studentRepository.deleteById(id);
    }
}
