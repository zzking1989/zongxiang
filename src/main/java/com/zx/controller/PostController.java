package com.zx.controller;

import com.baidu.ueditor.ActionEnter;
import org.apache.commons.fileupload.FileItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
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
    @RequestMapping(value = "/action", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Map<String,Object> save(HttpServletRequest req){
        Map<String,Object> rs = new HashMap<String, Object>();
        MultipartHttpServletRequest mReq  =  null;
        MultipartFile file = null;
        InputStream is = null ;
        String fileName = "";
        // 原始文件名   UEDITOR创建页面元素时的alt和title属性
        String originalFileName = "";
        String filePath = "";
        try {
            mReq = (MultipartHttpServletRequest)req;
            // 从config.json中取得上传文件的ID
            file = mReq.getFile("upfile");
            // 取得文件的原始文件名称
            fileName = file.getOriginalFilename();
            originalFileName = fileName;
            /*你的处理图片的代码*/
            rs.put("state", "SUCCESS");// UEDITOR的规则:不为SUCCESS则显示state的内容
            rs.put("url","http://localhost:8080/zx");         //能访问到你现在图片的路径
            rs.put("title", originalFileName);
            rs.put("original", originalFileName);

        } catch (Exception e) {
            logger.error(e.getMessage(),e);
            rs.put("state", "文件上传失败!"); //在此处写上错误提示信息，这样当错误的时候就会显示此信息
            rs.put("url","");
            rs.put("title", "");
            rs.put("original", "");
        }
        return rs;
    }


    }
