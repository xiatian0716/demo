package com.example.logstarter.aop;

import com.example.logstarter.annotation.LogAnnotation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;

@Aspect
@Order(-1)
public class LogAop {
    @Autowired
    @Qualifier("getObj")
    private Object getObj;

    @Around("@annotation(la)")
    public Object logRecord(ProceedingJoinPoint proceedingJoinPoint, LogAnnotation la) {
        Long start = System.currentTimeMillis();
        try {
            Object proceed = proceedingJoinPoint.proceed();
            System.out.println(la.module() + "模块的" +
                    proceedingJoinPoint.getSignature().getName() +
                    "方法，执行的耗时时间为：" +
                    (System.currentTimeMillis() - start) + "ms");
            System.out.println(getObj);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return null;
    }
}

