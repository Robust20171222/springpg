package com.xrc.spring.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);

        ActionTwo actionTwo = context.getBean(ActionTwo.class);

        System.out.println(actionTwo.sayHello("Annotation"));

        context.close();

    }
}
