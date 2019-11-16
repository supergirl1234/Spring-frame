package com.lei.aop;

import org.springframework.validation.ObjectError;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class CalImpl2Proxy implements InvocationHandler {

    /*目标对象，即被代理对象*/
    private Object target;
    /*生成一个代理对象*/
    public Object bind(Object object){
        this.target=object;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String name=method.getName();
        System.out.println(name+"方法的参数为："+ Arrays.toString(args));
        Object result=method.invoke(this.target,args);
        System.out.println(name+"方法的结果为："+ result);
        return result;
    }
}
