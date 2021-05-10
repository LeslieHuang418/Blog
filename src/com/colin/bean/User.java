package com.colin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author Huang JiaHang
 * @date 2021/5/7 19:05
 * @用户表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User
{
    private Integer id;
    private String name;
    private String username;
    private String password;
    private Timestamp postTime;
    private String tel;
    private Integer sex;
    private Integer age;
    private List<Essay> essayList;
    private List<FileHelper> fileHelperList;

    public User(String name, String username, String password, String tel, Integer sex, Integer age)
    {
        this.name = name;
        this.username = username;
        this.password = password;
        this.tel = tel;
        this.sex = sex;
        this.age = age;
    }
}
