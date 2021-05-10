package com.colin.mapper;

import com.colin.bean.User;
import org.apache.ibatis.annotations.Select;

/**
 * @author Huang JiaHang
 * @date 2021/5/9 22:46
 */
public interface FileMapper
{
    @Select("SELECT COUNT(*) FROM t_file WHERE file_user_id=#{id}")
    int loginUserFileCount(User user);
}
