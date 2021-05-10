package com.colin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author Huang JiaHang
 * @date 2021/5/9 19:25
 * @博客表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Essay
{
    private Integer id;
    private String essayName;
    //博客类别
    private Integer essayClassificationId1;
    private EssayClassification essayClassificationId2;
    private String essayContent;
    //博客标签
    private String essayLabel;
    private Timestamp insertTime;
    private Timestamp postTime;
    private User userId;
}
