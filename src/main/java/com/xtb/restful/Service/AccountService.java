package com.xtb.restful.Service;

import com.xtb.restful.bean.Account;
import com.xtb.restful.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    AccountMapper accountMapper;

    public Account getAccountById(int id){
        return accountMapper.getAccount(id);

    }


}
