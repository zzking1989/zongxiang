package com.zx.model;

import java.util.Date;


/**
 * <p>
 * 用户表
 * </p>
 *
 * @author cd
 * @since 2018-06-25
 */
public class Users {

    /**
     * 用户id
     */
	private Long id;
    /**
     * 用户名
     */
	private String userName;
    /**
     * 登录密码
     */
	private String password;
    /**
     * 用户头像
     */
	private String userPortrait;
    /**
     * 手机号码
     */
	private String phone;
    /**
     * 真实姓名
     */
	private String realName;
    /**
     * 年龄
     */
	private Integer age;
    /**
     * 身份证号码
     */
	private String idNumber;
    /**
     * 邮箱
     */
	private String mailbox;
    /**
     * 微信
     */
	private String wechat;
    /**
     * qq号码
     */
	private String qq;
    /**
     * 微博
     */
	private String microblog;
    /**
     * 1：超级用户2：管理员3:会员用户4：普通用户
     */
	private Integer userAuthority;
    /**
     * 1:正常2：违规3：封停
     */
	private Integer userStatus;
    /**
     * 发帖数量
     */
	private Integer invitationNum;
    /**
     * 积分
     */
	private Integer integral;
    /**
     * 备注
     */
	private String remark;
    /**
     * 备用字段
     */
	private String beiyong;
    /**
     * 创建时间
     */
	private Date createTime;
    /**
     * 修改时间
     */
	private Date updateTime;
    /**
     * 状态修改时间
     */
	private Date updateStatusTime;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserPortrait() {
		return userPortrait;
	}

	public void setUserPortrait(String userPortrait) {
		this.userPortrait = userPortrait;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getMailbox() {
		return mailbox;
	}

	public void setMailbox(String mailbox) {
		this.mailbox = mailbox;
	}

	public String getWechat() {
		return wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getMicroblog() {
		return microblog;
	}

	public void setMicroblog(String microblog) {
		this.microblog = microblog;
	}

	public Integer getUserAuthority() {
		return userAuthority;
	}

	public void setUserAuthority(Integer userAuthority) {
		this.userAuthority = userAuthority;
	}

	public Integer getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}

	public Integer getInvitationNum() {
		return invitationNum;
	}

	public void setInvitationNum(Integer invitationNum) {
		this.invitationNum = invitationNum;
	}

	public Integer getIntegral() {
		return integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getBeiyong() {
		return beiyong;
	}

	public void setBeiyong(String beiyong) {
		this.beiyong = beiyong;
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

	public Date getUpdateStatusTime() {
		return updateStatusTime;
	}

	public void setUpdateStatusTime(Date updateStatusTime) {
		this.updateStatusTime = updateStatusTime;
	}


}
