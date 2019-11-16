package com.lei.test;

import com.lei.entity.Grade;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory {

    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-factory.xml");
        /*测试静态工厂*/
        Grade grade1= (Grade) applicationContext.getBean("grade1");
        System.out.println(grade1);
        /*测试实例工厂*/
        Grade grade2= (Grade) applicationContext.getBean("grade2");
        System.out.println(grade2);
    }
}
