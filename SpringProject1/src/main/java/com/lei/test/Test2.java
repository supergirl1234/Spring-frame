package com.lei.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring2.xml");
        /*Student student= (Student) applicationContext.getBean("student");
        User user = (User) applicationContext.getBean("user");*/
    }
}
