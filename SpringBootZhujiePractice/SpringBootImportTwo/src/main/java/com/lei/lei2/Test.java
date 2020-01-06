package com.lei.lei2;
import com.lei.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
* 测试
*
* */
public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConfigTwo.class);
        User user1=applicationContext.getBean(User.class);
        Child child1=applicationContext.getBean(Child.class);
        user1.say();
        child1.say();
    }
}
