package com.zx.service;

import com.zx.model.Users;

import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author cd
 * @since 2018-06-25
 */
public interface UserService  {
    public List<Users> selectUsersAll();
}
