package com.zx.controller;

import com.alibaba.fastjson.support.odps.udf.CodecCheck;
import com.zx.service.UserService;
import com.zx.utils.Base64Util;
import com.zx.utils.MD5Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @Autowired
    UserService userService;
//	@RequestMapping("/list")
//    public  String list(Model model) throws IOException {
//        return "jsp/index2";
//    }


}
