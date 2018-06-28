package com.zx.dao;

import com.zx.model.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
  * 用户表 Mapper 接口
 * </p>
 *
 * @author cd
 * @since 2018-06-25
 */


//@Repository
//@Component
    @Mapper
public interface UserDao {
public List<Users>selectUsersAll();

}