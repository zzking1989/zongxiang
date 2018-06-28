package com.zx.service.impl;

import com.zx.dao.UserDao;
import com.zx.model.Users;
import com.zx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author cd
 * @since 2018-06-25
 */
@Service
public class UserServiceImpl  implements UserService {
    @Autowired
//    @Autowired(required=false)
     UserDao userDao;

    public List<Users> selectUsersAll(){
        System.out.println("进入service调用");
        List<Users> users = userDao.selectUsersAll();
        System.out.println("dao查询结束");
        return users;
    };
}
