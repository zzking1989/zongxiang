package com.zx.utils;

import java.io.Serializable;

public class ZongXiangResult implements Serializable {
    // 响应业务状态
    private Integer code;

    // 响应消息
    private String name;

    // 响应中的数据
    private Object data;


    public static ZongXiangResult build(Integer code, String name, Object data) {
        return new ZongXiangResult(code, name, data);
    }
    public static ZongXiangResult build(Integer code, String name) {
        return new ZongXiangResult(code, name);
    }

    public ZongXiangResult(Integer code, String name, Object data) {
        this.code = code;
        this.name = name;
        this.data = data;
    }
    public ZongXiangResult(Integer code, String name) {
        this.code = code;
        this.name = name;

    }
    public Integer getcode() {
        return code;
    }
    public void setcode(Integer code) {
        this.code = code;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "SportResult [code=" + code + ", name=" + name + ", data="
                + data + "]";
    }
}
