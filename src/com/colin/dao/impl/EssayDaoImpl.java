package com.colin.dao.impl;

import com.colin.bean.User;
import com.colin.dao.EssayDao;
import com.colin.mapper.EssayMapper;
import com.colin.util.DBUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

/**
 * @author Huang JiaHang
 * @date 2021/5/9 22:25
 */
public class EssayDaoImpl implements EssayDao
{
    @Override
    public int loginUserEssayCount(User user) throws IOException
    {
        SqlSession sqlSession = DBUtil.getSqlSession();
        EssayMapper mapper = sqlSession.getMapper(EssayMapper.class);
        return mapper.loginUserEssayCount(user);
    }

    @Override
    public User loginUserAllEssay(User user) throws IOException
    {
        SqlSession sqlSession = DBUtil.getSqlSession();
        EssayMapper mapper = sqlSession.getMapper(EssayMapper.class);
        return mapper.loginUserAllEssay(user);
    }

}
