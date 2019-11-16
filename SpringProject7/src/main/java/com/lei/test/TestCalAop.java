package com.lei.test;

import com.lei.aop.Cal;
import com.lei.aop.CalImpl;
import com.lei.aop.CalImpl2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCalAop {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-aop.xml");
        Cal cal= (Cal) applicationContext.getBean("cal");
        cal.add(1,1);
        cal.sub(2,3);
        cal.mul(2,3);
        cal.div(2,3);

    }
}
