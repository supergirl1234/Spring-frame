package com.lei.test;

import com.lei.entity.Grade;
import com.lei.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        User user= (User) applicationContext.getBean("user");
        System.out.println(user);

        Grade grade= (Grade) applicationContext.getBean("grade");
        System.out.println(grade);
        System.out.println("-------------------");
        User user1= (User) applicationContext.getBean("user1");
        System.out.println(user1);

        System.out.println("-------------------");
        Grade grade2= (Grade) applicationContext.getBean("grade2");
        System.out.println(grade2);
        Grade grade3= (Grade) applicationContext.getBean("grade3");
        System.out.println(grade3);
        Grade grade4= (Grade) applicationContext.getBean("grade4");
        System.out.println(grade4);

    }
}
