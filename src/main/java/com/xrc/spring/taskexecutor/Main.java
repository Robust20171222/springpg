package com.xrc.spring.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(TaskExecutorConfig.class);

        ExecutorService executorService = context.getBean(ExecutorService.class);

        for (int i = 0; i < 10; i++) {

            executorService.taskOne(i);

            executorService.taskTwo(i);

        }

        context.close();


    }
}
