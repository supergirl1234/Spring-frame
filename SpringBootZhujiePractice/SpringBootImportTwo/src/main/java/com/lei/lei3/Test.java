package com.lei.lei3;

import com.lei.User;
import com.lei.lei2.Child;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConfigThree.class);
        User user3=applicationContext.getBean(User.class);
        Child child3=applicationContext.getBean(Child.class);
        Teacher teacher3=applicationContext.getBean(Teacher.class);
        user3.say();
        child3.say();
        teacher3.say();
    }
}
