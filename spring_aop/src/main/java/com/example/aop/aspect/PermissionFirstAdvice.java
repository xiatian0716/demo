package com.example.aop.aspect;

import com.example.aop.annotation.PermissionAnnotation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * 2.定义切面-注解拦截
 * (1)、切面类加@Aspect 、@Service注解，告诉springboot这是一个切面类，帮我管起来；
 * (2)、定义切点@Pointcut；
 * (3)、定义切入点切入的时机及完成的功能(@Around、@Before、@After、@AfterReturning、@AfterThrowing)；
 * */
@Service
@Aspect
public class PermissionFirstAdvice {
    @Pointcut("@annotation(com.example.aop.annotation.PermissionAnnotation)")
    private void permissionCheck() {
    }

    @Around("permissionCheck() && @annotation(permissionAnnotation)")
    public Object permissionCheckFirst(ProceedingJoinPoint joinPoint, PermissionAnnotation permissionAnnotation) throws Throwable {
        System.out.println("1.获取注解切面PermissionAnnotation值："+ Arrays.toString(permissionAnnotation.value()));
        System.out.println("2.根据token获取用户的权限列表");
        System.out.println("3.判断用户是否具有权限");
        //此处joinPoint.proceed()执行目标方法
        // ，如果没有调用，则不执行目标方法；
        return joinPoint.proceed();
    }
}
