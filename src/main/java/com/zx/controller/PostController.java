package com.zx.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
@Slf4j
public class PostController {
//    private static final Logger log = LoggerFactory.getLogger(PostController.class);


    /**
     * 转跳到富文本页面
     * @param
     * @return
     */
    @RequestMapping("/ueditor")
    public  String ueditor() {
        System.out.println("转跳富文本页面");
        return "jsp/postSubmit";
    }

    /**
     * 接收帖子
     * @param contents
     * @param model
     * @return
     */
    @RequestMapping("/save")
//    @ResponseBody
    public String save(String contents ,Model model ) {
        System.out.println("接收到的富文本:"+contents);
        log.info("");
        model.addAttribute("contents",contents);
        return "jsp/postDetails";
    }


    }
