package com.sj.demo.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/*
 * @Author: daixq
 * @Date: 2021/4/8 15:08
 * @Description:
 **/
//@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity security) throws Exception {
        //下面这两行配置表示在内存中配置了两个用户
        security.formLogin()//表单登录
                .loginPage("/login.html")//指定登录页
                .and()
                .authorizeRequests()
                .antMatchers("/login.html").permitAll()//访问地址不需要进行身份认证
                .anyRequest()//任何请求
                .authenticated();//访问任何资源都需要身份认证
    }
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
