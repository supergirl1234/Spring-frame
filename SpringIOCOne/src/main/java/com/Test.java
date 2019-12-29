package com;

import com.controller.UserController;
import com.controller.UserController2;
import com.po.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Collection;
public class Test {

    public static void main(String[] args) {


        System.out.println("注解方式：");
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        UserController userController= (UserController) applicationContext.getBean("userController");
        User user=userController.getUserById(1);
        System.out.println(user.toString());
        Collection<User> collection=userController.getAllUser();
        System.out.println(collection);
        System.out.println("XML方式：");

        ApplicationContext applicationContext2=new ClassPathXmlApplicationContext("spring.xml");
        UserController2 userController2= (UserController2) applicationContext2.getBean("userController2");
        User user2=userController2.getUserById(1);
        System.out.println(user2.toString());
        Collection<User> collection2=userController2.getAllUser();
        System.out.println(collection2);


    }
}
