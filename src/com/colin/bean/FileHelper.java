package com.colin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Huang JiaHang
 * @date 2021/5/9 15:33
 * @附件表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileHelper
{
    //文件id
    private Integer id;
    //文件名称
    private String name;
    //文件路径
    private String filePath;
    //文件名加上uuid值
    private String nameUuid;
    //文件全名加路径
    private String allName;
    //关联博客的id
    private User userId;
    //关联用户的id
    private Essay EssayId;

    public FileHelper(String name, String filePath, String nameUuid, String allName)
    {
        this.name = name;
        this.filePath = filePath;
        this.nameUuid = nameUuid;
        this.allName = allName;
    }
}
