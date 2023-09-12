package com.xtb.restful.Service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Service2 {

    @Bean(name = "a4bean4service2")
    public void run1(){
        System.out.println("a4bean4service2");
    }
}
