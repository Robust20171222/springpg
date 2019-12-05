package com.xrc.spring.aopdemo;

import com.xrc.spring.aopdemo.Service.Drink;
import com.xrc.spring.aopdemo.Service.Eat;
import com.xrc.spring.aopdemo.Service.Speak;
import com.xrc.spring.aopdemo.config.MouthConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MouthConfig.class);

        Eat eat = context.getBean(Eat.class);

        Speak speak = context.getBean(Speak.class);

        Drink drink = context.getBean(Drink.class);

        eat.eatRice();

        speak.speak();

        drink.drinkWater();

        context.close();
    }

}
