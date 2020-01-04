package com.lei;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
        User user=applicationContext.getBean(User.class);
        user.say();
    }
}
