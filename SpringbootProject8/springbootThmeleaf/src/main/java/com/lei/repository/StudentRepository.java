package com.lei.repository;

import com.lei.entity.Student;

import java.util.Collection;

public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(Integer id);
    public void update(Student student);
    public void deleteById(Integer id);

    void save(Student student);
}
