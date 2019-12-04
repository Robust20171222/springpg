package com.xrc.spring.annotation;

import org.springframework.stereotype.Service;

@Service
public class ActionOne {

    public String sayHello(String word){
        return "Hello "+ word +" !";
    }

}
