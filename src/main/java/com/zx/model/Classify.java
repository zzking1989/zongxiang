package com.zx.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

/**
 * <p>
 * 分类表
 * </p>
 *
 * @author cd
 * @since 2018-06-25
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Classify {

    /**
     * 分类id
     */
    private Long classifyId;
    /**
     * 分类名称
     */
    private String classifyName;
    /**
     * 备注
     */
    private String remark;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;


}
