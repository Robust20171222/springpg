package com.xrc.spring.aopdemo.annotation;


import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OpenMouth {
    String  name() default "";
}
