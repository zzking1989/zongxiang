package com.zx.controller;

import com.baidu.ueditor.ActionEnter;
import org.apache.commons.fileupload.FileItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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
    private static final Logger logger = LoggerFactory.getLogger(PostController.class);

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


    @RequestMapping("/save")
//    @ResponseBody
    public String save(String contents ,Model model ) {
        System.out.println("接收到的富文本:"+contents);
        model.addAttribute("contents",contents);
        return "jsp/ueditor2";
    }

/**
 * 百度富文本编辑器：图片上传
 * @param request
 * @param response
 */
    @RequestMapping("/upload")
    public void imgUploadByUeditor(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding( "utf-8" );
        response.setHeader("Content-Type" , "text/html");
        ServletContext application=request.getServletContext();
        String rootPath = application.getRealPath( "/" );
        PrintWriter out = response.getWriter();
        out.write( new ActionEnter( request, rootPath ).exec() );
    }



    }
