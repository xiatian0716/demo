package com.example.logstarter.controller;

import com.example.logstarter.annotation.LogAnnotation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 6.测试
 * */
@RestController
@RequestMapping("/hello")
public class TestController {

    @LogAnnotation()
    @RequestMapping("/test")
    public String getTest() throws InterruptedException {
        Thread.sleep(2000);
        return "我正在测试自定义springboot的starter的启动器";
    }

    @LogAnnotation()
    @RequestMapping("aa")
    public String getString() {
        return "aaa";
    }
}
