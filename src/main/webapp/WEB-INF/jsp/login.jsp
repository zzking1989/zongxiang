<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>登录页面提交表单</title>
    <meta name="content-type" content="text/html; charset=UTF-8">
</head>
<!-- 全局js -->
<script src="../js/jquery.min.js"></script>
<script src="../js/jquery-1.8.3.js"></script>
<body>
<form id="loginForm" name="loginForm" >
         <table  align="center">
             <tr>
                 <td>用户名：</td>
                 <td colspan="2"><input type="text" name="username" id="username" /></td>
              </tr>
              <tr>
                 <td>密  码：</td>
                 <td colspan="2"><input type="password" name="password" id="password" /></td>
              </tr>
             <span class="span1"></span>
                 <td colspan="3" align="center">
                      <input id="submit" type="submit" value="登录"/>
                 </td>
              </tr>
          </table>
     </form>
<script>
    $(function() {
        $('#submit').click(function() {
            $.ajax({
                url: '/user/ajaxLogin',
                type: 'post',
                dataType:'json',
                data: $("#loginForm").serializeArray(),
                success: function(data) {
                    console.log(data)
                    console.log("进入返回")
                    if (data.code1 == 1) {
                    window.location.href = '/user/login';
                    }else {
                        $('.span1').html(data.name1)
                    }
                }
            });
        });
    });
</script>
</body>
</html>

