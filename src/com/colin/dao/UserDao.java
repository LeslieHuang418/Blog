package com.colin.dao;

import com.colin.bean.User;

import java.io.IOException;

/**
 * @author Huang JiaHang
 * @date 2021/5/9 19:18
 */
public interface UserDao
{
    //用户登录验证
    User selectLoginUser(String username, String password) throws IOException;
    //用户注册
    int userRegister(User user) throws IOException;
}
