package com.xtb.restful.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xtb.restful.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
