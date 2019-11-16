package com.lei.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class CalImplAop {


    @Pointcut("execution(public int com.lei.aop.CalImpl2.*(..))")
    public void hello(){


    }
    @Before("hello()")
    public void BeforeOfAllFunction(){
        System.out.println("hello");
    }

    @Before("execution(public int com.lei.aop.CalImpl2.*(..))")
    public void before(JoinPoint joinPoint){

        String name=joinPoint.getSignature().getName();
        Object[] objects=joinPoint.getArgs();
        System.out.println(name+"方法的参数为："+Arrays.toString(objects));
    }
    @AfterReturning(value = "execution(public int com.lei.aop.CalImpl2.*(..))",returning="result")
    public void after(JoinPoint joinPoint,Object result){
        String name=joinPoint.getSignature().getName();
        System.out.println(name+"方法的结果为："+result);

    }

}
