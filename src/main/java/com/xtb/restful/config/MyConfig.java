package com.xtb.restful.config;

import com.xtb.restful.bean.Pet;
import com.xtb.restful.bean.User;
import com.xtb.restful.model.User2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
//    @Bean
//    public User user1(){
//        return new User("zhangsan",18);
//    }
//    @Bean
//    public Pet catPet(){
//        return new Pet("Tom");
//    }

    @Bean(name = "bean4config")
    public void run1(){
        System.out.println("bean4config");
    }
}
