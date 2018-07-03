package com.zx.controller;

import com.zx.model.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>
 * 帖子表 前端控制器
 * </p>
 *
 * @author cd
 * @since 2018-06-25
 */
@Controller
@RequestMapping("/post")
public class PostController {
    /**
     * 转跳到富文本页面
     * @param
     * @return
     */
    @RequestMapping("/ueditor")
    public  String ueditor() {
        System.out.println("转跳富文本页面");
        return "jsp/ueditor";
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public String save(String userName,String content ) {
        System.out.println(userName);
        System.out.println(content);
        return content;
    }
	
}
