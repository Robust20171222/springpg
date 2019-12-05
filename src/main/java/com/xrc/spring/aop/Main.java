package com.xrc.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        AnnotationService annotationService = context.getBean(AnnotationService.class);

        MethodService methodService = context.getBean(MethodService.class);

        //被action标签标记的方法
        annotationService.add();

        //使用execution匹配方法
        methodService.add();

        context.close();

    }
}
