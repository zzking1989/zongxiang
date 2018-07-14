<%--
  Created by IntelliJ IDEA.
  User: Zhou Zhou
  Date: 2018/7/13
  Time: 18:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-theme.min.css">
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
    <script src="../js/jquery.min.js"></script>
    <script src="../js/jquery-1.8.3.js"></script>
</head>
<body style="margin: 0;padding: 0">
<div align="center" style="margin-top: 150px">
    <h2>用户注册</h2>

    <div>
        <form id="registerForm" method="post" enctype="multipart/form-data" action="/user/save">
            <div class="form-group" style="width: 400px;text-align: left">
                <label>用户名:</label>
                <input type="text" class="form-control" style="width: 400px" id="userName" name="userName" placeholder="请输入名称" onBlur="username()">
                <span class="span1" id="usernameSpan" style="color: brown" hidden>用户名不能为空！</span>
            </div>
            <div class="form-group" style="width: 400px;text-align: left">
                <label>密码:</label>
                <input type="password" class="form-control" style="width: 400px" id="password" name="password" placeholder="请输入密码">
                <span class="span2" id="passwordSpan" style="color: brown" hidden>密码不能为空！</span>
            </div>
            <div class="form-group" style="width: 400px;text-align: left">
                <label>重复密码：</label>
                <input type="text" class="form-control" style="width: 400px" id="repeatPassword" placeholder="请输入名称">
                <span class="span3" id="repeatPasswordSpan" style="color: brown" hidden>重复密码不能为空！</span>
            </div>
            <input type="file" id="titleImg" name="titleImg" hidden />
            <div class="form-group" style="width: 400px;">
                <button type="submit" class="btn btn-primary" onclick="register()" style="width: 100px">提交</button>
            </div>
        </form>
    </div>
</div>
</body>
<script>
    function register() {
        var loginFormValues = document.getElementById("registerForm")
        if (loginFormValues.elements[0].value == "") {
            console.info("用户名不能为空！")
            $("#usernameSpan").show();
            return;
        }
        //验证首字母必须为字母

        if (loginFormValues.elements[1].value == "") {
            $("#passwordSpan").show();
            return;
        }  if (loginFormValues.elements[2].value == "") {
            $("#repeatPasswordSpan").show();
            return;
        }  if (loginFormValues.elements[1].value != loginFormValues.elements[2].value) {
            $("#repeatPasswordSpan").html("两次输入密码不相同！").show();
            return;
        }
    }
    function username() {
        var userName =$('#userName').val().toString();
        alert(userName)
        $.ajax({
                type: "POST",//方法类型
                dataType: "",//预期服务器返回的数据类型
                url: "/user/userNameVerify",//url
                data: {userName:userName},
                success: function (result) {
                    // console.log(result);//打印服务端返回的数据
                    // alert(result);//弹框
                         alert(result.name1)
                        $("#usernameSpan").html(result.name1).show;
                },
                error: function () {
                    alert("异常！");
                }
            });
    }
    $(document).ready(function () {
        $("#username").focus(function () {
            $("#usernameSpan").hide();
        })
        $("#password").focus(function () {
            $("#passwordSpan").hide();
        })
        $("#repeatPassword").focus(function () {
            $("#repeatPasswordSpan").hide();
        })

    });
</script>
</html>
