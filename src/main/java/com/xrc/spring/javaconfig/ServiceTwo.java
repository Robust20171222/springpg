package com.xrc.spring.javaconfig;

public class ServiceTwo {

    ServiceOne serviceOne;

    public void setServiceOne(ServiceOne serviceOne) {
        this.serviceOne = serviceOne;
    }

    public String sayHello(String word){
        return serviceOne.sayHello(word);
    }


}

