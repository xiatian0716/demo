package com.example.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 2.定义切面-表达式拦截
 * 表达式：* com.example.demo.controller..*.*(..)
 * 第一个 * 号的位置：表示返回值类型，* 表示所有类型。
 * 包名：表示需要拦截的包名，后面的两个句点表示当前包和当前包的所有子包，在本例中指 com.example.demo.controller.包、子包下所有类的方法。
 * 第二个 * 号的位置：表示类名，* 表示所有类。
 * *(..)：这个星号表示方法名，* 表示所有的方法，后面括弧里面表示方法的参数，两个句点表示任何参数。
 *
 * 切点多个表达式或注解
 * 多个表达式之间使用 ||,or表示 或，使用 &&,and表示 与，！表示 非
 * @Pointcut("execution(* com.example.demo.controller..*.*(..))||@annotation(com.example.demo.anot.PermissionAnnotation)")
 * */
@Component
@Aspect
public class ControllerAdvice {
    @Pointcut("execution(* com.example.aop.controller..*.*(..))")
    public void chtrollerPict(){
    }
    @Around("chtrollerPict()")
    public Object permissionCheckFirst(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("controllerAdvice");
        return joinPoint.proceed();
    }
}
