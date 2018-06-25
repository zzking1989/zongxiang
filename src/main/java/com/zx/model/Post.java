package com.zx.model;

import java.util.Date;

/**
 * <p>
 * 帖子表
 * </p>
 *
 * @author cd
 * @since 2018-06-25
 */
public class Post  {

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


	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getPostClassid() {
		return postClassid;
	}

	public void setPostClassid(Integer postClassid) {
		this.postClassid = postClassid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitlePicture() {
		return titlePicture;
	}

	public void setTitlePicture(String titlePicture) {
		this.titlePicture = titlePicture;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public String getPostStatus() {
		return postStatus;
	}

	public void setPostStatus(String postStatus) {
		this.postStatus = postStatus;
	}

	public Integer getReadingNum() {
		return ReadingNum;
	}

	public void setReadingNum(Integer ReadingNum) {
		this.ReadingNum = ReadingNum;
	}

	public Integer getLikeNum() {
		return likeNum;
	}

	public void setLikeNum(Integer likeNum) {
		this.likeNum = likeNum;
	}

	public Integer getDissNum() {
		return dissNum;
	}

	public void setDissNum(Integer dissNum) {
		this.dissNum = dissNum;
	}

	public Integer getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(Integer commentNum) {
		this.commentNum = commentNum;
	}

	public String getReward() {
		return reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

	public String getPostNote() {
		return postNote;
	}

	public void setPostNote(String postNote) {
		this.postNote = postNote;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getReviewTime() {
		return reviewTime;
	}

	public void setReviewTime(Date reviewTime) {
		this.reviewTime = reviewTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}



}
