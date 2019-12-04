package com.xrc.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public ServiceOne serviceOne(){
        return new ServiceOne();
    }

    @Bean
    public ServiceTwo serviceTwo(){
        ServiceTwo serviceTwo = new ServiceTwo();
        serviceTwo.setServiceOne(serviceOne());
        return serviceTwo;
    }

    @Bean ServiceTwo serviceTwo(ServiceOne serviceOne){
        ServiceTwo serviceTwo = new ServiceTwo();
        serviceTwo.setServiceOne(serviceOne);
        return serviceTwo;
    }

}
