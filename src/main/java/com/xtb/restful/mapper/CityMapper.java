package com.xtb.restful.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xtb.restful.bean.Account;
import com.xtb.restful.bean.City;
import com.xtb.restful.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Map;


@Mapper
public interface CityMapper  extends BaseMapper<City> {

    @Select("select * from city where id = #{id}")
    public City getCty(int id);

    @Select("select * from city")
    public Select.List getCtys();

//    Map<String, Object> selectMapById(int id);
}
