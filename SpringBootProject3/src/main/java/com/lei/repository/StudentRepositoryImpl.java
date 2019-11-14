package com.lei.repository;

import com.lei.entity.Student;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements  StudentRepository {

    private static Map<Integer,Student> studentMap;
    static {

        studentMap=new HashMap<>();
        studentMap.put(1,new Student(1,"张三",11));
        studentMap.put(2,new Student(2,"李四",12));
        studentMap.put(3,new Student(3,"王五",13));
        studentMap.put(4,new Student(4,"Lucky",14));
    }
    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(int id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
       studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(int id) {
         studentMap.remove(id);
    }
}
