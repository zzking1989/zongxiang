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
     UserDao userDao;

    @Override
    public int saveUsers(Users users) {
        Long id =users.getId();
        if (id!=null||id!=0){
            return userDao.updateUsers(users);
        }else {
            return userDao.insertUsers(users);
        }
    }

    @Override
    public List<Users> selectUsersAll(){
        return userDao.selectUsersAll();
    }

    @Override
    public List<Users> selectUsersList(Users users) {
        return userDao.selectUsersList(users);
    }

    @Override
    public Users selectUsersById(Long id) {
        return userDao.selectUsersById(id);
    }

    @Override
    public Users selectUsersByUserName(String userName) {
        return userDao.selectUsersByUserName(userName);
    }

    @Override
    public int deleteUsersById(Long id) {
        return userDao.deleteUsersById(id);
    }


}
