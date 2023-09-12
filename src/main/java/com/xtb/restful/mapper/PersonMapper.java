package com.xtb.restful.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xtb.restful.bean.Person;
import org.springframework.stereotype.Repository;

import java.util.Map;


public interface PersonMapper extends BaseMapper<Person> {
    Map<String,Object> selectMapById(Long id);

}
