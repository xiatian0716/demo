package com.example.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * import注解用法
 * 1.声明Configuration类
 * Import在使用时,必须要保证能被IOC容器扫描到，所以通常它会和@Configuration或者@ComponentScan配套使用。
 * 2.通过Import导入类
 * Import通过快速导入的方式实现把实例加入spring的IOC容器中
 * 3.声明被导入的类Dog
 * 4.从IOC中获取导入类
 * */
@SpringBootApplication
public class ImportApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImportApplication.class, args);
    }

}
