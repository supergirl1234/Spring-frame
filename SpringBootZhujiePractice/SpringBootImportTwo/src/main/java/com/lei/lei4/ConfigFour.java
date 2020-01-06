package com.lei.lei4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Conditional(MyCondition.class)  //MyConditionl里面的matches方法返回了true，则该配置类才会生效；
@Configuration
public class ConfigFour {

    @Bean
    public ConditionBean getConditionBean(){
        return  new ConditionBean();
    }
}
