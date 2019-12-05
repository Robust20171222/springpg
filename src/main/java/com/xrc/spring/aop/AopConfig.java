package com.xrc.spring.aop;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan("com.xrc.spring.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
