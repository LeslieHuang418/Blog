package com.colin.mapper;

import com.colin.bean.User;
import org.apache.ibatis.annotations.Select;

/**
 * @author Huang JiaHang
 * @date 2021/5/9 22:13
 */
public interface EssayMapper
{
    @Select("SELECT COUNT(*) FROM t_essay WHERE essay_user_id=#{id}")
    int loginUserEssayCount(User user);

    User loginUserAllEssay(User user);
}
