package com.lei.test;

import com.lei.entity.InformationContainer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-informationContainer.xml");
        InformationContainer informationContainer= (InformationContainer) applicationContext.getBean("informationContainer");
        System.out.println(informationContainer);
    }
}
