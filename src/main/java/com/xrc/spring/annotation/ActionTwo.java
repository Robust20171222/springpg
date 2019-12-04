package com.xrc.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActionTwo {

    @Autowired
    ActionOne actionOne;

    public String sayHello(String word){
        return actionOne.sayHello(word);
    }

}
