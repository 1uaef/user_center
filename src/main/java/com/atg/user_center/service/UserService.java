package com.atg.user_center.service;

import com.atg.user_center.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;


/**
* @author 啊汤哥
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2024-06-27 21:32:58
*/
public interface UserService extends IService<User> {
    // 用户注册
    Long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);
    // 用户登录
    User userLogin(String userAccount, String userPassword,HttpServletRequest request);
    // 用户注销
    void userLogout(HttpServletRequest request);
    // 脱敏
    User getSafetyUser(User originUser);


}
