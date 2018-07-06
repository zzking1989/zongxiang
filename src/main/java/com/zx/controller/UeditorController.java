package com.zx.controller;

import com.baidu.ueditor.ActionEnter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

@RequestMapping("UeditorController")
@Controller
public class UeditorController {
    private static final Logger logger = LoggerFactory.getLogger(UeditorController.class);

    /**
     * 初始化百度编辑器，可传入其他参数生成不同的编辑器,总入口
     * 百度富文本编辑器
     * @param request
     * @param response
     */
    @RequestMapping("/upload")
    public void imgUploadByUeditor(HttpServletRequest request, HttpServletResponse response) {
        PrintWriter out = null;
        try {
            response.setContentType("application/json");
            request.setCharacterEncoding("utf-8");
            response.setHeader("Content-Type", "text/html");
            String rootPath = request.getSession().getServletContext().getRealPath("/");
            out = response.getWriter();
            out.write(new ActionEnter(request, rootPath).exec());
            out.flush();
            logger.info("百度编辑器初始化成功！");
        } catch (IOException e) {
            logger.error("百度编辑器初始化错误！", e);
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }






}
