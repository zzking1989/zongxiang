package com.zx.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * <p>
 * 用户表
 * </p>
 *
 * @author cd
 * @since 2018-06-25
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

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


}
