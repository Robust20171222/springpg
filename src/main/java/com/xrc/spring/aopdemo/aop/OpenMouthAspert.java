package com.xrc.spring.aopdemo.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


/***
 * 需张口动作的拦截器
 */

@Aspect
@Component
public class OpenMouthAspert {

    @Pointcut("@annotation(com.xrc.spring.aopdemo.annotation.OpenMouth)")
    public void useMouth(){}

    @Before("useMouth()")
    public void before(){
        System.out.println("张口");
    }


}
