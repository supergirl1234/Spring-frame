package com.lei.lei3;
        /*
         * 配置类
         * */
        import com.lei.User;
        import com.lei.lei2.MyImportSelector;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.context.annotation.Import;

@Import({User.class,MyImportSelector.class,MyImportBeanDefinitionRegistar.class})
@Configuration
public class ConfigThree {
}
