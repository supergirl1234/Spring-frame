package com.lei.repository;

import com.lei.entity.Student;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class StudentRepositoryImpl implements  StudentRepository {

    public static Map<Integer,Student> map;
    static {

        map=new HashMap<>();
        map.put(1,new Student(1,"Lucy",12));
        map.put(2,new Student(2,"Lucky",13));
        map.put(3,new Student(3,"Moon",14));
        map.put(4,new Student(4,"LaDa",15));
    }
    @Override
    public Collection<Student> findAll() {
        return map.values();
    }

    @Override
    public Student findById(Integer id) {
        return map.get(id);
    }

    @Override
    public void update(Student student) {

        map.put(student.getId(),student);
    }

    @Override
    public void deleteById(Integer id) {
         map.remove(id);
    }

    @Override
    public void save(Student student) {
        map.put(student.getId(),student);
    }
}
