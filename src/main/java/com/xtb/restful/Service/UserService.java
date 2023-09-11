package com.xtb.restful.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xtb.restful.bean.City;
import com.xtb.restful.bean.User;
import com.xtb.restful.mapper.CityMapper;
import com.xtb.restful.mapper.UserMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserMapper,User> implements IService<User> {
//    @Autowired
//    UserMapper userMapper;
//
//    public void getData(){
//        User user = userMapper.selectById(1);
//        System.out.println(user.getName());
//
//    }
}
