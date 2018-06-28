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
@Mapper
public interface UserDao {
    //新增用户
    public int insertUsers (Users users);

    //修改用户信息
    public int updateUsers (Users users);

    //查询所有用户
    public List<Users>selectUsersAll();

    //根据条件筛选用户
    public List<Users>selectUsersList(Users users);

    //根据id查询用户
    public Users selectUsersById(Long id);

    //根据用户名查询用户
    public Users selectUsersByUserName(String userName);

    //根据id删除用户
    public int deleteUsersById(Long id);

}