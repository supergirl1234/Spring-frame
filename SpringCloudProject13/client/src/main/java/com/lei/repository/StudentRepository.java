package com.lei.repository;

import com.lei.po.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface StudentRepository {

    public Collection<Student> findAll();
    public Student findById(Integer id);
    public void update(Student student);
    public void Insert(Student student);
    public void deleteById(Integer id);
}
