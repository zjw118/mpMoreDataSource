package com.zjwmybatis.mybatisplus.mysql.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;
@Data
public class Teacher {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer age;
    @Version
    private Integer version;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date modifyTime;
    @TableLogic
    private Integer deleted;



}
