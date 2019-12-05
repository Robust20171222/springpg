package com.xrc.spring.aopdemo.Service;

import com.xrc.spring.aopdemo.annotation.OpenMouth;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/***
 * 喝水动作
 */

@Service
@Scope("singleton")
public class Drink {


    @OpenMouth(name = "drink water")
    public void drinkWater(){
        System.out.println("喝水");
    }
}
