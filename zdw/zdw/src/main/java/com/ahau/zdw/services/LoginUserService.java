package com.ahau.zdw.services;

import com.ahau.zdw.pojo.LoginUser;
import org.springframework.stereotype.Service;


public interface LoginUserService {

    public int checkUser(LoginUser loginUser);

    public int registerUser(LoginUser loginUser);
}
