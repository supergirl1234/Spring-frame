package com.lei.controller;


import com.lei.entity.Student;
import com.lei.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentHandler {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/findAll")
    public List<Student> findAll(){

        return  studentRepository.findAll();
    }
    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Integer id){

        return  studentRepository.findById(id);
    }
    @PostMapping("/save")
    public void save(@RequestBody Student student)
    {
        studentRepository.save(student);
    }
    @PutMapping("/update")
    public void update(@RequestBody Student student)
    {
        studentRepository.update(student);
    }
    @GetMapping("deleteById/{id}")
    public void delete(Integer id){

        studentRepository.deleteById(id);
    }
}
