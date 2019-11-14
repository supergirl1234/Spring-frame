package com.lei.ioc;

import com.lei.entity.Student;

public class Test {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Student student= (Student) applicationContext.getBean("student");
        System.out.println(student);
    }
}
