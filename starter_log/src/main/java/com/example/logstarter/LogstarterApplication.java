package com.example.logstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.告诉spring的配置类位置
 * 新建文件spring.factories，填写自动加载类的信息
 * 2.新建配置类并通过Import自动注入类
 * 通过Import注解引入LogSelector类，LogSelector类主要
 * 3.创建Import引入的LogSelector类
 * LogSelector类主要是通过继承ImportSelector类，让spring自动导入LogAop类
 * 4.创建LogAop类
 * LogAop类主要用于拦截LogAnnotation注解，用于拦截后进行一些列日志操作
 * 5.创建LogAnnotation注解
 * 用于标志AOP切入点
 * 6.测试
 * http://localhost:8080/hello/test
 * */
@SpringBootApplication
public class LogstarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogstarterApplication.class, args);
    }

}
