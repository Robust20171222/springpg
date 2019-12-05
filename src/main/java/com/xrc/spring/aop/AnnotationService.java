package com.xrc.spring.aop;

import org.springframework.stereotype.Service;

@Service
public class AnnotationService {
    @Action(name = "标签截拦")
    public void add() { }
}
