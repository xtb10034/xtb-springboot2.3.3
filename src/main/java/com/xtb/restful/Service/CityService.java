package com.xtb.restful.Service;

import com.xtb.restful.bean.City;
import com.xtb.restful.mapper.CityMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    CityMapper cityMapper;

    public City getCty(int id){
        return cityMapper.getCty(id);
    }

    public Select.List getCtys(){
        return cityMapper.getCtys();
    }
}
