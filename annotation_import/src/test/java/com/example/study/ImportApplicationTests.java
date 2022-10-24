package com.example.study;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ImportApplicationTests {
    private static AnnotationConfigApplicationContext classPath;
    @Test
    public void testConsutrator(){
        // 4.从IOC中获取导入类
        classPath = new AnnotationConfigApplicationContext(AppConfig.class);
        Dog exampleBean = classPath.getBean(Dog.class);
        System.out.println(exampleBean);
    }

}
