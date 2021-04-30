package com.ahau.zdw.controller;


import com.ahau.zdw.pojo.JSONResult;
import com.ahau.zdw.pojo.LoginUser;
import com.ahau.zdw.services.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    LoginUserService loginUserService;


    @RequestMapping("login")
    @ResponseBody
    public JSONResult userLogin(Integer loginId,String password){
        LoginUser loginUser = new LoginUser();
        loginUser.setLoginId(loginId);
        loginUser.setPassword(password);
        int a = loginUserService.checkUser(loginUser);
        System.out.println(loginId+":"+password);
        if(a == 1) {
            return JSONResult.ok();
        }else{
            return JSONResult.errorMsg("密码错误");
        }
    }

    @RequestMapping("register")
    @ResponseBody
    public JSONResult userRegister(Integer loginId,String password){
        LoginUser loginUser = new LoginUser();
        loginUser.setLoginId(loginId);
        loginUser.setPassword(password);
        int a = loginUserService.registerUser(loginUser);
        if(a == 1) {
            return JSONResult.ok();
        }else{
            return JSONResult.errorMsg("密码错误");
        }
    }


}
