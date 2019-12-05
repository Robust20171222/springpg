package com.xrc.spring.aopdemo.Service;

import com.xrc.spring.aopdemo.annotation.OpenMouth;
import com.xrc.spring.aopdemo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Drink {

//    @Autowired
//    Person person;

    @OpenMouth(name = "drink water")
    public void drinkWater(){
        System.out.println("喝水");
    }
}
