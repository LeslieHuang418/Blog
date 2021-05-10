package com.colin.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Huang JiaHang
 * @date 2021/5/10 15:38
 */
public class DBUtil
{
    public static SqlSession getSqlSession() throws IOException
    {
        InputStream resourceAsStream = Resources.getResourceAsStream("com/colin/config/Configuration.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        return build.openSession(true);
    }
}
