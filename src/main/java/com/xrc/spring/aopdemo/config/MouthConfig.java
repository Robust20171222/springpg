package com.xrc.spring.aopdemo.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/***
 * 关于嘴巴的配置
 */

@Configuration
@ComponentScan("com.xrc.spring.aopdemo")
@EnableAspectJAutoProxy
public class MouthConfig {
}
