package com.zx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
        System.out.println("转跳用户详情页面");
        return "jsp/ueditor";
    }
	
}
