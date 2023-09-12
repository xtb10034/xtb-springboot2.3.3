package com.xtb.restful.Service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
public class Service1 {
    @DependsOn(value = {"a4bean4service2"})
    @Bean(name = "bbb")
    public void run1(){
        System.out.println("bean4service1_bbb");
    }

    @Bean(name = "aaa")
    public void run2(){
        System.out.println("bean4service1_aaa");
    }
}
