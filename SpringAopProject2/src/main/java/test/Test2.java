package test;

import com.lei.util.Cal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

    public static void main(String[] args) {
        /*读取配置文件*/
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-aop.xml");

        /*获取代理对象*/
        Cal calProxy= (Cal) applicationContext.getBean("calImpl");//默认的名字
        calProxy.add(1,1);
        calProxy.sub(2,1);
        calProxy.mul(2,3);
        calProxy.div(6,0);
    }
}
