package com.lei.aop;

import org.springframework.stereotype.Component;

@Component(value = "cal")/*设置的bean的id，可以不写，则默认为类的首字母小写*/
public class CalImpl2 implements Cal {

    @Override
    public int add(int num1, int num2) {


        int result=num1+num2;

        return result;
    }

    @Override
    public int sub(int num1, int num2) {

        int result=num1-num2;

        return result;
    }

    @Override
    public int mul(int num1, int num2) {

        int result=num1*num2;

        return result;
    }

    @Override
    public int div(int num1, int num2) {
        int result=num1/num2;
        return result;
    }
}
