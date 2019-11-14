package com.lei.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggerAspect {


    @Before("execution(public int com.lei.impl.CalImpl.*(..))")
    public void printBefore(JoinPoint joinPoint){
        /*获取方法名*/
        String name=joinPoint.getSignature().getName();
        /*获取参数*/
        String args=Arrays.toString(joinPoint.getArgs());
        System.out.println(name+"方法的参数是{"+args+"}");
    }

    @After(value = "execution(public  int  com.lei.impl.CalImpl.*(..))")
    public void printAfter(JoinPoint joinPoint){
        //获取方法的名字
        String name=joinPoint.getSignature().getName();
        System.out.println(name+"方法执行结束");

    }

    @AfterReturning(value ="execution(public  int  com.lei.impl.CalImpl.*(..))",returning = "result")
    public void afterReturn(JoinPoint joinPoint,Object result){
        //获取方法的名字
        String name=joinPoint.getSignature().getName();
        System.out.println(name+"方法的结果为"+result);

    }

    @AfterThrowing(value ="execution(public  int  com.lei.impl.CalImpl.*(..))",throwing = "exception")
    public void afterThrowing( JoinPoint joinPoint,Exception exception){
        //获取方法的名字
        String name=joinPoint.getSignature().getName();
        System.out.println(name+"方法抛出的异常为："+exception);

    }
}
