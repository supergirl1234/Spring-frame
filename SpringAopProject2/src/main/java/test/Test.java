package test;

import com.lei.impl.CalImpl;
import com.lei.util.Cal;
import com.lei.impl.MyInvocayionHandler;

public class Test {

    public static void main(String[] args) {

        /*Cal cal=new CalImpl();
        cal.add(1,1);
        cal.sub(3,1);
        cal.mul(2,3);
        cal.div(6,3);*/



        Cal cal=new CalImpl();
        MyInvocayionHandler myInvocayionHandler=new MyInvocayionHandler();
        Cal calProxy= (Cal) myInvocayionHandler.bind(cal);
        calProxy.add(1,1);
        calProxy.add(1,1);
        calProxy.sub(3,1);
        calProxy.mul(2,3);
        calProxy.div(6,3);
    }
}
