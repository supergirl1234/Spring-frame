package com.lei.test;

import com.lei.entity.Address;
import com.lei.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-p.xml");
        Student student= (Student) applicationContext.getBean("student");
        System.out.println(student);
        Address address= (Address) applicationContext.getBean("address");
        System.out.println(address);

    }
}
