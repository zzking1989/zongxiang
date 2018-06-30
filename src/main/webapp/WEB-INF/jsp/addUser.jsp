<%--
  Created by IntelliJ IDEA.
  User: 123456
  Date: 2018/6/30
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" id="f" action="/user/save" enctype="multipart/form-data">
    <input type="hidden" name="id" value="1">
    <table class="table">
    <tr>
        <td class="tdTitle" width="15%">用户名:</td>
        <td width="35%">
            <input type="text" class="text" name="userName" id="userName" value="${(user.userName)}" />
        </td>
        <td class="tdTitle" width="15%">密码:</td>
        <td width="35%">
            <input type="text" class="text" name="password" id="password" value="${(user.password)}"/>
        </td>
    </tr>
    <tr>
        <td class="tdTitle" width="15%">图片:</td>
        <td colspan="3">
            <input type="file" id="titleImg" name="titleImg" onchange="selectFile(this,0);"/>
            <img src="${(datasUrl)}" style="width:500px;width:500px;" onclick="javascript:window.open(this.src);"
            />
        </td>
    </tr>
    </table>
    <div class="toolsBtn">
        <input type="submit" class="b submit" value="提交"/>
        <input type="button" class="b" value="关闭" onclick="closes();"/>
    </div>
</form>
</body>
</html>
