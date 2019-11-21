package com.lei.repository;

import com.lei.po.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

   public Student getById(Integer id);
}
