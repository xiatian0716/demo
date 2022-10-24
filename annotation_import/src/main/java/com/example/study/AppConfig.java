package com.example.study;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(Dog.class)  // 2.通过Import导入类
@Configuration      // 1.声明Configuration类
public class AppConfig {
}
