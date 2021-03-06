package com.zx.controller;

import com.zx.model.Users;
import com.zx.service.UserService;
import com.zx.utils.IsMobile;
import com.zx.utils.ZongXiangResult;
import com.zx.utils.configuration;
import lombok.extern.slf4j.Slf4j;
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
     *
     * @param
     * @return
     * @throws
     */
    @RequestMapping("/index")
    public String index(HttpServletRequest request, Model model) {
//查询系统+浏览器
        String osAndBrowserInfo = IsMobile.getOsAndBrowserInfo(request);
        System.out.println(osAndBrowserInfo);


//        if(IsMobile.isMobileDevice(request)){
//            logger.info("使用手机浏览器转跳首页");
//        }else{
//            logger.info("使用web浏览器转跳首页");
//        }
        HttpSession session = request.getSession();
        if (session.getAttribute("userName") != null && session.getAttribute("userName") != "") {
            String userName = session.getAttribute("userName").toString();
            model.addAttribute("userName", userName);
        }
        return "main";
    }

    /**
     * 转跳登录
     *
     * @param
     * @return
     */
    @RequestMapping("/login")
    public String login() {
        System.out.println("转跳登录页面");
        return "jsp/login";
    }

    /**
     * 登录验证
     *
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
        log.info("request:" + "username=" + username + "password=" + password);
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
        if (users == null || !password.equals(users.getPassword())) {
            log.error("用户名或者密码不正确");
            return new ZongXiangResult(2, "用户名或者密码不正确", null);
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("userName", username);
            log.info(username + "登录成功");
            return new ZongXiangResult(1, "登录成功", null);
        }
    }

    @RequestMapping("register")
    public String register() {
        System.out.println("转跳注册页面");
        return "/jsp/register";
    }

    @RequestMapping("/save")
    public String save(Users users, @RequestParam(value = "titleImg", required = false) MultipartFile titleImg)
            throws Exception {
        userService.saveUsers(users, titleImg);
        return "redirect:/user/userMsg";
//        return new ZongXiangResult(1, "注册成功", null);
    }
    @RequestMapping("/userNameVerify")
    @ResponseBody
    public ZongXiangResult userNameVerify(String userName) {
        Users users = userService.selectUsersByUserName(userName);
        if (users!=null) {
            return new ZongXiangResult(2, "用户名已被使用", null);
        }else {
            return new ZongXiangResult(1, "此用户名可用", null);
        }
    }

    /**
     * 用户退出
     *
     * @param
     * @return
     */
    @RequestMapping("/loginout")
    public String loginout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("userName");
        System.out.println("用户退出");
        return "main";
    }

    /**
     * 转跳用户详情
     *
     * @param
     * @return
     */
    @RequestMapping("/userMsg")
    public String userMsg(Model model) {
        System.out.println("转跳用户详情页面");
        Users users = userService.selectUsersById(1L);
        String img = configuration.URL + users.getUserPortrait().replace("\\", "/");
        System.out.println(img);
        users.setUserPortrait(img);
        model.addAttribute("user", users);
        return "jsp/userMsg";
    }


}
