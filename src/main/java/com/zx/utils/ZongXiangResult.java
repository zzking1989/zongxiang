package com.zx.utils;

import java.io.Serializable;

public class ZongXiangResult implements Serializable {
    // 响应业务状态
    private Integer code1;

    // 响应消息
    private String name1;

    // 响应中的数据
    private Object data1;


    public static ZongXiangResult build(Integer code1, String name1, Object data1) {
        return new ZongXiangResult(code1, name1, data1);
    }
    public static ZongXiangResult build(Integer code1, String name1) {
        return new ZongXiangResult(code1, name1);
    }

    public ZongXiangResult(Integer code1, String name1, Object data1) {
        this.code1 = code1;
        this.name1 = name1;
        this.data1 = data1;
    }
    public ZongXiangResult(Integer code1, String name1) {
        this.code1 = code1;
        this.name1 = name1;

    }
    public Integer getCode1() {
        return code1;
    }
    public void setCode1(Integer code1) {
        this.code1 = code1;
    }
    public String getName1() {
        return name1;
    }
    public void setName1(String name1) {
        this.name1 = name1;
    }
    public Object getData() {
        return data1;
    }
    public void setData(Object data1) {
        this.data1 = data1;
    }
    @Override
    public String toString() {
        return "SportResult [code1=" + code1 + ", name1=" + name1 + ", data1="
                + data1 + "]";
    }
}
