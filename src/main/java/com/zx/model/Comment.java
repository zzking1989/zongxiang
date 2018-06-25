package com.zx.model;

import java.util.Date;

/**
 * <p>
 * 评论表
 * </p>
 *
 * @author cd
 * @since 2018-06-25
 */
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


	public Long getCommentId() {
		return commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCommentNote() {
		return commentNote;
	}

	public void setCommentNote(String commentNote) {
		this.commentNote = commentNote;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}


}
