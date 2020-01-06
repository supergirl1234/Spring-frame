package com.lei.lei2;
import com.lei.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
/*
* 配置类
*/
@Import({User.class,MyImportSelector.class})  //导入User类，导入MyImportSelector类
@Configuration
public class ConfigTwo {
}
