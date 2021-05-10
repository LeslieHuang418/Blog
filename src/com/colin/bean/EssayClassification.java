package com.colin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Huang JiaHang
 * @date 2021/5/9 19:43
 * @博客类别表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EssayClassification
{
    private Integer id;
    //类别名称
    private String className;
    //当前类别的博客集合
    private List<Essay> essayList;
}
