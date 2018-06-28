package com.zx.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * <p>
 * 帖子表
 * </p>
 *
 * @author cd
 * @since 2018-06-25
 */


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Post {

    /**
     * 帖id
     */
    private Long postId;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 分类表id
     */
    private Integer postClassid;
    /**
     * 标题
     */
    private String title;
    /**
     * 标题图片
     */
    private String titlePicture;
    /**
     * 内容
     */
    private String content;
    /**
     * 审核状态
     */
    private String approvalStatus;
    /**
     * 帖子状态
     */
    private String postStatus;
    /**
     * 阅读数量
     */
    private Integer ReadingNum;
    /**
     * 点赞数量
     */
    private Integer likeNum;
    /**
     * 踩踏数量
     */
    private Integer dissNum;
    /**
     * 评论数量
     */
    private Integer commentNum;
    /**
     * 打赏金额
     */
    private String reward;
    /**
     * 帖备注
     */
    private String postNote;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 审核时间
     */
    private Date reviewTime;
    /**
     * 修改时间
     */
    private Date updateTime;


}
