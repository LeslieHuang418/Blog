package com.colin.dao;

import com.colin.bean.User;

/**
 * @author Huang JiaHang
 * @date 2021/5/9 22:51
 */
public interface NoteDao
{
    //查当前用户收到的所有的留言
    int loginUserHaveNoteCount(User user);
}
