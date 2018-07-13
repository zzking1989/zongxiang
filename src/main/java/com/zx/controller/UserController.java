package com.zx.controller;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.zx.model.Users;
import com.zx.service.UserService;
import com.zx.utils.IsMobile;
import com.zx.utils.ZongXiangResult;
import com.zx.utils.configuration;
import eu.bitwalker.useragentutils.Browser;
import eu.bitwalker.useragentutils.OperatingSystem;
import eu.bitwalker.useragentutils.UserAgent;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
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
import javax.xml.ws.Response;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author cd
 * @since 2018-06-25
 */
@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {
//    private static final Logger log = LoggerFactory.getLogger(UserController.class);
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

        String osAndBrowserInfo = IsMobile.getOsAndBrowserInfo(request);
        System.out.println(osAndBrowserInfo);


//        if(IsMobile.isMobileDevice(request)){
//            logger.info("使用手机浏览器转跳首页");
//        }else{
//            logger.info("使用web浏览器转跳首页");
//        }
        HttpSession session = request.getSession();
        if (session.getAttribute("userName")!=null&&session.getAttribute("userName")!=""){
        String userName = session.getAttribute("userName").toString();
        model.addAttribute("userName",userName);
        }
        return "main";
    }
    /**
     * 转跳登录
     * @param
     * @return
     */
	@RequestMapping("/login")
    public  String login() {
        System.out.println("转跳登录页面");
        return "jsp/login";
    }

    /**
     * 登录验证
     * @param request
     * @param
     * @param
     * @return
     */
    @RequestMapping("/ajaxLogin")
    @ResponseBody
    public ZongXiangResult ajaxLogin(HttpServletRequest request) {
        //取值方法1 接收前台传过来的一个指定的参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        log.info("request:"+"username="+username+"password="+password);
//        //取值方法2 留着不要删除以后用
//        Map<String,String> params = new HashMap<>();
//        //getParameterMap()一般多用于接收前台表单多参数传输的数据
//        Map requestParams = request.getParameterMap();
//        System.out.println(requestParams.toString());
//        for(Iterator iter = requestParams.keySet().iterator(); iter.hasNext();){
//            String name = (String)iter.next();
//            String[] values = (String[]) requestParams.get(name);
//            String valueStr = "";
//            for(int i = 0 ; i <values.length;i++){
//                valueStr = (i == values.length -1)?valueStr + values[i]:valueStr + values[i]+",";
//            }
//            //把数据全部加进map集合中
//            params.put(name,valueStr);
//        }
//        logger.info("requestmap",params.get("username"),params.get("password"),params.toString());
//        String username = params.get("username");
//        String password = params.get("password");




        Users users = userService.selectUsersByUserName(username);
        if (username.equals("")||password.equals("")){
            log.error("用户名或者密码空");
            return new ZongXiangResult(3,"用户名或者密码不能为空",null);
        } else if (users==null||!password.equals(users.getPassword())){
            log.error("用户名或者密码不正确");
            return new ZongXiangResult(2,"用户名或者密码不正确",null);
        }else {
            HttpSession session = request.getSession();
            session.setAttribute("userName",username);
            log.info(username+"登录成功");
            return  new ZongXiangResult(1,"登录成功",null);
        }
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Users users, @RequestParam(value = "titleImg", required = false) MultipartFile titleImg)
            throws Exception {
            userService.saveUsers(users,titleImg);
        return "redirect:/user/userMsg";
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
        return "main";
    }
    /**
     * 转跳用户详情
     * @param
     * @return
     */
    @RequestMapping("/userMsg")
    public  String userMsg(Model model) {
        System.out.println("转跳用户详情页面");
        Users users = userService.selectUsersById(1L);
        String img =configuration.URL+users.getUserPortrait().replace("\\","/");
        System.out.println(img);
        users.setUserPortrait(img);
        model.addAttribute("user",users);
        return "jsp/userMsg";
    }



}
