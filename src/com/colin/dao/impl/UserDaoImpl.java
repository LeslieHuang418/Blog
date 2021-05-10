package com.colin.dao.impl;

import com.colin.bean.User;
import com.colin.dao.UserDao;
import com.colin.mapper.UserMapper;
import com.colin.util.DBUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

/**
 * @author Huang JiaHang
 * @date 2021/5/7 19:05
 */
public class UserDaoImpl implements UserDao
{

    @Override
    public User selectLoginUser(String username, String password) throws IOException
    {
        SqlSession sqlSession = DBUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectLoginUser(username, password);
    }

    @Override
    public int userRegister(User user) throws IOException
    {
        SqlSession sqlSession = DBUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.userRegister(user);
    }
}
