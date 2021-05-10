package com.colin.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Huang JiaHang
 * @date 2021/5/7 20:28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageHelper<T>
{
    //    当前页数
    private Integer nowPage;
    //    总页数
    private Integer totalPage;
    //    一页有多少个
    private static final Integer SizeOnePage = 5;
    //    总共有多少个
    private Integer totalSize;
    //    当前展示的开始位置
    private Integer beginSize;
    //    一页展示的内容
    private List<T> onePageList;

    public PageHelper(Integer totalSize, Integer nowPage)
    {
        this.totalSize = totalSize;
        this.nowPage = nowPage;
        this.totalPage = methodHowPage(totalSize);
        this.beginSize = beginSizeMethod(nowPage);
    }

    //多少页
    public Integer methodHowPage(Integer totalSize)
    {
        int a = totalSize / SizeOnePage;
        if (totalSize % SizeOnePage == 0)
        {
            return a;
        }
        else
        {
            return (a + 1);
        }
    }

    //每次的开始位置
    public Integer beginSizeMethod(Integer nowPage)
    {
        return ((nowPage - 1) * SizeOnePage);
    }
}
