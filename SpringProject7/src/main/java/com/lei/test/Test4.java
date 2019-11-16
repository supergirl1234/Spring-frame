package com.lei.test;

import com.lei.entity.Address;
import com.lei.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-dependson.xml");
        User user1= (User) applicationContext.getBean("user1");
        Address address1= (Address) applicationContext.getBean("address1");

        User user2= (User) applicationContext.getBean("user2");
        Address address2= (Address) applicationContext.getBean("address2");
    }
}
