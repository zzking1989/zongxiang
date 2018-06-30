package com.zx.service;

import com.zx.model.Users;
import org.springframework.web.multipart.MultipartFile;

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

    //新增或修改用户
    public int saveUsers (Users users, MultipartFile titleImg) throws Exception;

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
