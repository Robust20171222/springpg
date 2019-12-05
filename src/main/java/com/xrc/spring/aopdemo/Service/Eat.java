package com.xrc.spring.aopdemo.Service;


import com.xrc.spring.aopdemo.annotation.OpenMouth;
import org.springframework.stereotype.Service;

@Service
public class Eat {
    @OpenMouth(name = "eat rice")
    public void eatRice(){
        System.out.println("吃饭");
    }
}
