package com.colin.mapper;

import com.colin.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * @author Huang JiaHang
 * @date 2021/5/7 19:05
 */
public interface UserMapper
{
    @Select("SELECT id,name,username,password,post_time,tel,sex,age\n" +
            "FROM t_user WHERE username=#{param1} AND password=#{param2}")
    User selectLoginUser(String username, String password);

    @Insert("INSERT INTO t_user(name,username,password,tel,sex,age) " +
            "VALUES(#{name},#{username},#{password},#{tel},#{sex},#{age})")
    int userRegister(User user);
}
