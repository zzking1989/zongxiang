package com.zx.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

/**
 * <p>
 * 评论表
 * </p>
 *
 * @author cd
 * @since 2018-06-25
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Comment {


    /**
     * 评论id
     */
    private Long commentId;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 帖子id
     */
    private Long postId;
    /**
     * 内容
     */
    private String content;
    /**
     * 图片
     */
    private String picture;
    /**
     * 状态1:正常
     */
    private String status;
    /**
     * 备注
     */
    private String commentNote;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;


}
