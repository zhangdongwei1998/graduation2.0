package com.ahau.zdw.services.impl;

import com.ahau.zdw.mapper.LoginUserMapper;
import com.ahau.zdw.pojo.LoginUser;
import com.ahau.zdw.services.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginUserServiceImpl implements LoginUserService {

    @Autowired
    LoginUserMapper loginUserMapper;

    @Override
    public int checkUser(LoginUser loginUser) {
        LoginUser loginUser1 = loginUserMapper.selectOne(loginUser);
        if(loginUser1!=null){
            return 1;
        }else return 0;
    }

    @Override
    public int registerUser(LoginUser loginUser) {
        return loginUserMapper.insert(loginUser);
    }
}
