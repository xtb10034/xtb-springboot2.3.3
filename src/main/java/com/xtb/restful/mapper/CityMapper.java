package com.xtb.restful.mapper;

import com.xtb.restful.bean.Account;
import com.xtb.restful.bean.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;



@Mapper
public interface CityMapper {

    @Select("select * from city where id = #{id}")
    public City getCty(int id);

    @Select("select * from city")
    public Select.List getCtys();
}
