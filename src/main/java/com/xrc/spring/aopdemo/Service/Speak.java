package com.xrc.spring.aopdemo.Service;


import com.xrc.spring.aopdemo.annotation.OpenMouth;
import org.springframework.stereotype.Service;

@Service
public class Speak {
    @OpenMouth(name = "Speak")
    public void speak(){
        System.out.println("说话");
    }
}
