package com.zx.controller;

import com.zx.model.Users;
import com.zx.service.UserService;
import com.zx.utils.ReturnJson;
import com.zx.utils.ZongXiangResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

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
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;
    /**
     * 转跳首页
     * @param
     * @return
     * @throws
     */
    @RequestMapping("/index")
    public  String index(HttpServletRequest request, Model model) {
        System.out.println("转跳首页");
        HttpSession session = request.getSession();
        if (session.getAttribute("userName")!=null&&session.getAttribute("userName")!=""){
        String userName = session.getAttribute("userName").toString();
        model.addAttribute("userName",userName);
        }
        return "index2";
    }
    /**
     * 转跳登录
     * @param
     * @return
     * @throws IOException
     */
	@RequestMapping("/login")
    public  String login() {
        System.out.println("转跳登录页面");
        return "jsp/login";
    }

    /**
     * 登录验证
     * @param request
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/ajaxLogin")
    @ResponseBody
    public ZongXiangResult ajaxLogin(HttpServletRequest request, String username, String password) {
        ZongXiangResult z=null;
        System.out.println("登录验证");
        if (username.equals("")||password.equals("")){
            z.build(3,"用户名或者密码不能为空");
            logger.error("用户名或者密码空");
            return  z;
        }
        Users users = userService.selectUsersByUserName(username);
        System.out.println("users="+users);
        if (users==null||!password.equals(users.getPassword())){
            z.build(2,"用户名或者密码不正确");
            logger.error("用户名或者密码不正确");
            return z;
        }else {
            HttpSession session = request.getSession();
            session.setAttribute("userName",username);
            z.build(1,"登录成功");
            logger.info(username+"登录成功");
            return z;
        }
    }

}
