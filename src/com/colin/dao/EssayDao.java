package com.colin.dao;

import com.colin.bean.User;

import java.io.IOException;

/**
 * @author Huang JiaHang
 * @date 2021/5/9 22:25
 */
public interface EssayDao
{
    //查询登录用户的微博个数
    int loginUserEssayCount(User user) throws IOException;

    //差登录用户的文章
    User loginUserAllEssay(User user) throws IOException;
}
