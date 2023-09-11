package com.xtb.restful.mapper;

import com.xtb.restful.bean.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {
    public Account getAccount(int id);
}
