package com.lei.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/*
* 这个类用来配置角色与权限的关系
* */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /*该方法是用来添加账户和角色的*/
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(new MyPasswordEncoder())
        .withUser("user").password(new MyPasswordEncoder().encode("000")).roles("USER")
                /*账户用户名是:user,账户密码是:000,该账户的角色是：USER*/
        .and()
        .withUser("admin").password(new MyPasswordEncoder().encode("123")).roles("ADMIN","USER");
        /*账户用户名是:admin,账户密码是:123,该账户的角色是：ADMIN、USER*/
    }

    /*该方法设置角色与权限的关系*/
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests().antMatchers("/admin").hasRole("ADMIN")
                /*要想访问/admin，则访问该地址的用户的角色必须是 ADMIN*/
                .antMatchers("/index").access("hasRole('ADMIN') or hasRole('USER')")
               /*要想访问/index，则访问该地址的用户的角色是 ADMIN还是USER都可*/
                .anyRequest().authenticated() /*上面的请求全部要进行验证*/
                .and()
                .formLogin()
                .loginPage("/login")  /*使用自定义的登录界面*/
                .permitAll()  /*permitAll()指登录不做验证*/
                .and()
                .logout()
                .permitAll() /*permitAll()指退出不做验证*/
                .and()
                .csrf()
                .disable();
    }
}
