<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>页面验证</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
    String name = request.getParameter("usename");
    String pass = request.getParameter("pass");
    if (name != null && pass!= null) {
        if (("李兴华".equals(name)) && ("mldn".equals(pass))) {
            response.setHeader("refresh", "3;URL=welcome.jsp");
            session.setAttribute("userid", name);
%>
<h3>用户登录成功3秒后会自动跳转到欢迎页!</h3>
如果没有跳转请按
<a href="welcome.jsp">这里</a>跳转
<%
} else {
%>
<h3>错误的用户名或密码</h3>
<%
        }
    }
%>
</body>
</html>