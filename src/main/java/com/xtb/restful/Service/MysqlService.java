package com.xtb.restful.Service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class MysqlService {
    private static Log logger = LogFactory.getLog(UserService1.class);
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void printInfo(String msg){
        List<Map<String, Object>> result = jdbcTemplate.queryForList("select * from user");
        result.forEach(o->{
            System.out.println("MSG "+ o.get("name"));
        });
        System.out.println("MSG "+ msg);
    }
}
