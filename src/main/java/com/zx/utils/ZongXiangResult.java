package com.zx.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ZongXiangResult {
    // 响应业务状态
    private Integer code1;

    // 响应消息
    private String name1;

    // 响应中的数据
    private Object data1;



}
