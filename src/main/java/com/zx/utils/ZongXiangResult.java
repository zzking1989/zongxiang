package com.zx.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ZongXiangResult {
    // 响应业务状态
    private Integer code1;

    // 响应消息
    private String name1;

    // 响应中的数据
    private Object data1;


    @Override
    public String toString() {
        return "SportResult [code1=" + code1 + ", name1=" + name1 + ", data1="
                + data1 + "]";
    }
}
