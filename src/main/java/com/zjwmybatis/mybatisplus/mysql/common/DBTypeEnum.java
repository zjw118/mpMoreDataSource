package com.zjwmybatis.mybatisplus.mysql.common;

/**
 * 动态数据源枚举类
 */
public enum DBTypeEnum {

    db1("db1"), db2("db2");
    private String value;

    DBTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}