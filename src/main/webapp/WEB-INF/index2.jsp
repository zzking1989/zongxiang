<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>

<html>
<body>
<c:if test="${ not empty userName}">
    <ul>
        <li><a href="#">${userName},欢迎!</a></li>
        <li><a href="/user/userMsg">我的详情</a></li>
        <li><a href="/user/loginout">退出</a></li>
    </ul>
</c:if>
<c:if test="${empty userName}">
    <ul>
        <li><a href="">注册</a></li>
        <li><a href="/user/login">登录</a></li>
    </ul>
</c:if>

<h1>首页</h1>
<h2>Hello World!</h2>

<%--<a href="user/login">登录</a>--%>
</body>
</html>
