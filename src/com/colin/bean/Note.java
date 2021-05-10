package com.colin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author Huang JiaHang
 * @date 2021/5/9 19:39
 * @留言表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Note
{
    private Integer id;
    private Timestamp insertTimes;
    private String noteContent;
    private Essay essay;
    private User user;
    private Essay essayId;
    private User userId;
}
