package com.example.aop.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.aop.annotation.PermissionAnnotation;
import org.springframework.web.bind.annotation.*;

/**
 * 3.测试
 * */
@RestController
@RequestMapping(value = "/permission")
public class TestController {
    @RequestMapping(value = "/check", method = RequestMethod.GET)
    @PermissionAnnotation("system:post:list")
    public JSONObject getGroupList() {
        System.out.println("4.权限验证通过执行方法");
        return JSON.parseObject("{\"message\":\"SUCCESS\",\"code\":200}");
    }
}