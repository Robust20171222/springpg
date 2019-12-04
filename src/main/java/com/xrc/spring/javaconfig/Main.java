package com.xrc.spring.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        ServiceTwo serviceTwo = context.getBean(ServiceTwo.class);

        System.out.println(serviceTwo.sayHello("JavaConfig"));

        context.close();
    }
}
