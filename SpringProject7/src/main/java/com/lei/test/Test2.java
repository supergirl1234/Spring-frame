package com.lei.test;

import com.lei.entity.Container;
import com.lei.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-container.xml");
        Container container= (Container) applicationContext.getBean("container");
        System.out.println(container);
    }
}
