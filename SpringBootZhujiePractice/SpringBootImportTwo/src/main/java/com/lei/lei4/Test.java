package com.lei.lei4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConfigFour.class);
        ConditionBean conditionBean=applicationContext.getBean(ConditionBean.class);
        conditionBean.say();
    }
}
