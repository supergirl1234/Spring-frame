package com.lei.test;

import com.lei.entity.Car;
import com.lei.factory.InstanceCarFactory;
import com.lei.factory.StaticCarFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

    public static void main(String[] args) {

        /*静态工厂*/
        //一般
     /*   Car car=StaticCarFactory.getCar(1);
        System.out.println(car);*/

     /*通过IOC容器,*/
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-factory.xml");
        Car car= (Car) applicationContext.getBean("car");
        System.out.println(car);



        /*实例工厂*/
        /*一般*/
        InstanceCarFactory instanceCarFactory=new InstanceCarFactory();
        Car car1=instanceCarFactory.getCar(1);
        System.out.println(car1);


        /*通过IOC容器,*/
        ApplicationContext applicationContext1=new ClassPathXmlApplicationContext("spring-factory.xml");
        Car car2= (Car) applicationContext.getBean("car1");
        System.out.println(car1);

    }
}
