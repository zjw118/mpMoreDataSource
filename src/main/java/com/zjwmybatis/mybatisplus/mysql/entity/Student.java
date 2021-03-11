package com.zjwmybatis.mybatisplus.mysql.entity;
/** Created by hspcadmin on 2021/2/3. */
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * @author hspcadmin
 * @create 2021-02-03 14:02
 */
@Data
public class Student {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;
    private Integer age;

    // 字段自动填充
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date modifyTime;

    @Version private Integer version;

    // 逻辑删除
    @TableLogic private Integer deleted;
}
