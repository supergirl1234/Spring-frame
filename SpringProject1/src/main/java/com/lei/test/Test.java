package com.lei.test;

import com.lei.entity.Student;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static  void code1(){
        Student student=new Student();
        student.setId(1);
        student.setName("张三");
        student.setAge(12);
        System.out.println(student);

    }
    public static void main(String[] args) {

        /*加载配置文件*/
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
      /* Student student= (Student) applicationContext.getBean("student");
        //Student student= (Student) applicationContext.getBean(Student.class);//这种方式存在一个问题，配置文件中一个数据类型的对象，只能有一个实例，否则会抛出异常，因为此时没有唯一的bean；
        System.out.println(student);
*/
     /*   Student student2= (Student) applicationContext.getBean("student2");
        System.out.println(student2);
        Student student3= (Student) applicationContext.getBean("student3");
        System.out.println(student3);
        Student student4= (Student) applicationContext.getBean("student4");
        System.out.println(student4);*/


        Student student11= (Student) applicationContext.getBean("student11");
        Student student112= (Student) applicationContext.getBean("student11");
        System.out.println(student11==student112);


        System.out.println("---------------------------------------------");
        Student student= (Student) applicationContext.getBean("student");
        System.out.println(student);
        Student student111= (Student) applicationContext.getBean("student111");
        System.out.println(student111);

    }
}
