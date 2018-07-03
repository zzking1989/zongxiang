package com.zx.controller;

import com.zx.model.Users;
import com.zx.service.UserService;
import com.zx.utils.IsMobile;
import com.zx.utils.ReturnJson;
import com.zx.utils.ZongXiangResult;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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
        String requestHeader = request.getHeader("user-agent");
        if(IsMobile.isMobileDevice(requestHeader)){
            logger.info("使用手机浏览器转跳首页");
        }else{
            logger.info("使用web浏览器转跳首页");
        }
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
        System.out.println("登录验证");
        Users users = userService.selectUsersByUserName(username);
        if (username.equals("")||password.equals("")){
            logger.error("用户名或者密码空");
            ZongXiangResult zongXiangResult = new ZongXiangResult();
            zongXiangResult.setCode1(3);
            zongXiangResult.setName1("用户名或者密码不能为空");
            return zongXiangResult;
        } else if (users==null||!password.equals(users.getPassword())){
            logger.error("用户名或者密码不正确");
            ZongXiangResult zongXiangResult = new ZongXiangResult();
            zongXiangResult.setCode1(2);
            zongXiangResult.setName1("用户名或者密码不正确");
            return zongXiangResult;
        }else {
            HttpSession session = request.getSession();
            session.setAttribute("userName",username);
            logger.info(username+"登录成功");
            ZongXiangResult zongXiangResult = new ZongXiangResult();
            zongXiangResult.setCode1(1);
            zongXiangResult.setName1("登录成功");
            String s = JSONObject.fromObject(zongXiangResult).toString();
            return zongXiangResult;
        }
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public ReturnJson save(Users users, @RequestParam(value = "titleImg", required = false) MultipartFile titleImg)
            throws Exception {
            userService.saveUsers(users,titleImg);
        return new ReturnJson(true, "", null);
    }
    /**
     * 用户退出
     * @param
     * @return
     */
    @RequestMapping("/loginout")
    public  String loginout(HttpServletRequest request) {
        HttpSession session = request.getSession();
         session.removeAttribute("userName");
        System.out.println("用户退出");
        return "index2";
    }
    /**
     * 转跳用户详情
     * @param
     * @return
     */
    @RequestMapping("/userMsg")
    public  String userMsg() {
        System.out.println("转跳用户详情页面");
        return "jsp/userMsg";
    }



}
