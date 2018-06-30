package com.zx.service.impl;

import com.zx.dao.UserDao;
import com.zx.model.Users;
import com.zx.service.UserService;
import com.zx.utils.RandomUtil;
import com.zx.utils.configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
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
    public int saveUsers(Users users, MultipartFile titleImg)  {
        Long id = users.getId();
        if (id != null && id != 0) {
            try {
                uploadFile(users, titleImg);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return userDao.updateUsers(users);
        } else {
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


    /**
     * 上传头像
     * @param users
     * @param titleImg
     * @throws Exception
     */
    private void uploadFile(Users users, MultipartFile titleImg) throws Exception {

                if (titleImg != null) {
                    //设定目录
                    String filePath = configuration.ZONGXIANGIMAGE + File.separator + configuration.USER_PORTRAIT;
                    String path = filePath + File.separator + users.getId();
                    long timeMillis = System.currentTimeMillis();
                    int randomValue = RandomUtil.getRandomValue(9000, 1000);
                    //文件名
                    String fileName = timeMillis + "" + randomValue + titleImg.getOriginalFilename().substring(
                            titleImg.getOriginalFilename().lastIndexOf("."), titleImg.getOriginalFilename().length());
                    File f = new File(path);
                    if (!f.exists()) {
                        f.mkdirs();
                    }
                    //创建文件夹
                    f = new File(path + File.separator + fileName);
                    titleImg.transferTo(f);
                    //写入数据库
                    users.setUserPortrait( File.separator + configuration.USER_PORTRAIT + File.separator
                            + users.getId() + File.separator + fileName);
                }
            }



}
