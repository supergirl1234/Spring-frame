package com.lei;

        /*
         * 配置类
         * */

        import org.springframework.context.annotation.Configuration;
        import org.springframework.context.annotation.Import;

/*导入User类*/
@Import({User.class})
@Configuration
public class Config {
}
