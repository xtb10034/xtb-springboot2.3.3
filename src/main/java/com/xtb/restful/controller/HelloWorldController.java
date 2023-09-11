package com.xtb.restful.controller;


import com.xtb.restful.Service.AccountService;
import com.xtb.restful.Service.CityService;
import com.xtb.restful.Service.MysqlService;
import com.xtb.restful.Service.UserService;
import com.xtb.restful.bean.Account;
import com.xtb.restful.bean.City;
import com.xtb.restful.bean.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("user")
public class HelloWorldController {
    private static Log logger = LogFactory.getLog(HelloWorldController.class);

    @Autowired
    MysqlService mysqlService;

    @Autowired
    AccountService accountService;

    @Autowired
    UserService userService;

    @Autowired
    CityService cityService;

    @Autowired
    RedisTemplate redisTemplate;

    @RequestMapping("/hello")
    public String handle01(@RequestParam("name") String name){

        logger.info("请求进来了....");
        return "Hello, Spring Boot 2!"+"你好："+name;
    }

    @RequestMapping("/h1")
    public String handle01(){

        logger.info("请求进来了....");
        mysqlService.printInfo("a");
        return "Hello, Spring Boot 2!"+"你好：" ;
    }
    @ResponseBody
    @RequestMapping("/acct")
    public Account getById(@RequestParam("id") int id){
        return accountService.getAccountById(id);
    }
    @ResponseBody
    @RequestMapping("/cty")
    public City getCtyById(@RequestParam("id") int id){
        return cityService.getCty(id);
    }

    @ResponseBody
    @RequestMapping("/ctys")
    public Select.List getCty(){
        Select.List list = cityService.getCtys();
        System.out.println(list.toString());
        return list;
    }

    @ResponseBody
    @RequestMapping("/data")
    public void getData(){
        User user = userService.getById(1);
        System.out.println(user.getName());

        userService.list().forEach(o->{
            System.out.println(o.getName());
        });

        String key1 = "key1";
        ValueOperations<String, String> a = redisTemplate.opsForValue();
        a.set("key2","lala");
        a.set("key3","aaaa");
        a.set("xtb","bbb");
        System.out.println("redis: " + a.get(key1));
        System.out.println("redis: " + a.get("key3"));
    }


//    @RequestMapping("/car")
//    public Car car(){
//        return car;
//    }


}