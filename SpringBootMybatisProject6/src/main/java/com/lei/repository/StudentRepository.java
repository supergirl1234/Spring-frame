package com.lei.repository;

import com.lei.entity.Student;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface StudentRepository {
    public List<Student>  findAll();
    public Student findById(Integer id);
    public void save(Student  student);
    public void update(Student student);
    public void deleteById(Integer id);

}
