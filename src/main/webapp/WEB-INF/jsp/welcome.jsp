<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>验证成功后的页面</title>
</head>
<body>
<%
    if(session.getAttribute("userid")!=null)
    {
%>
<h3>欢迎<%=session.getAttribute("userid")%>光临本系统<br>
    注销请点击<a href="logout.jsp">这里</a>
</h3>
<%
}
else{
%>
<h3>请先进行系统的<a href="font.html">登录</a></h3>
<%
    }
%>
</body>
</html>