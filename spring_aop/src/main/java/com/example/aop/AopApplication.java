package com.example.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.定义注解
 * 2.定义切面-注解拦截
 * 2.定义切面-表达式拦截
 * 3.测试
 * http://localhost:8080/permission/check
 * */
@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
	}

}
