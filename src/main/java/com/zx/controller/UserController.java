package com.zx.controller;

import com.zx.model.Users;
import com.zx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author cd
 * @since 2018-06-25
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
	@RequestMapping("/list")
    public String list(Model model){
        System.out.println("进入Controller");
        List<Users> users = userService.selectUsersAll();
        System.out.println(users);
        return "jsp/index2";
    }
    @RequestMapping("/list2")
    public String list2(Model model){
        System.out.println("22222");
        return "jsp/session_login";
    }

}
