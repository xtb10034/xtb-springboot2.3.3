package com.xtb.restful.Dao;

import com.xtb.restful.model.User2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Map;

@Component
public class UserDao {
//    private JdbcTemplate jdbcTemplate;

    @Autowired
//    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;


    public List<Map<String, Object>> getDataSourceUserId(){
        String sql = "SELECT * FROM people";
        System.out.println(sql);
        List<Map<String,Object>> result = jdbcTemplate.queryForList(sql);
        return result;
    }


    //getAll
    public List<User2> list() throws Exception {
        String sql = "SELECT * FROM user";
        List<User2> userList = jdbcTemplate.query(sql,
                new BeanPropertyRowMapper(User2.class));

        return userList;
    }

}
