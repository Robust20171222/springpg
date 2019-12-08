package com.xrc.spring.taskexecutor;


import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ExecutorService {

    @Async
    public void taskOne(int i){
        System.out.println("taskone: "+i);
    }

    @Async void taskTwo(int i){
        System.out.println("tasktwo: "+(i+1));
    }

}
