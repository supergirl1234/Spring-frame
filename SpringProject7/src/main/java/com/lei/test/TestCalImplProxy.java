package com.lei.test;

import com.lei.aop.Cal;
import com.lei.aop.CalImpl2;
import com.lei.aop.CalImpl2Proxy;

public class TestCalImplProxy {

    public static void main(String[] args) {

        Cal cal=new CalImpl2();
        CalImpl2Proxy calImpl2Proxy=new CalImpl2Proxy();
        Cal cal1= (Cal) calImpl2Proxy.bind(cal);
        cal1.add(1,1);
        cal1.sub(2,1);
        cal1.mul(2,3);
        cal1.div(6,3);
    }
}
