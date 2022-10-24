package com.example.logstarter.configuration;

import com.example.logstarter.selector.LogSelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 2.新建配置类并通过Import自动注入类
 * */
@Configuration
@Import(LogSelector.class)
public class LogAutoConfiguration {
    @Bean
    public Object getObj(){
        System.out.println("自动生成Object对象到spring bean工厂");
        return new Object();
    }
}

