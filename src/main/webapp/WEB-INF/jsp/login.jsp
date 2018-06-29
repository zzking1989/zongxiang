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
<%--<form id="signupForm" onclick="login()" >--%>
    <%--<h4>登录：</h4>--%>
    <%--<input type="text"     name="username"      placeholder="用户名"   /><br>--%>
    <%--<input type="password" name="password"  placeholder="密码"   />--%>
    <%--<span class="span1"></span>--%>
    <%--<a href="#">忘记密码了？</a>--%>
    <%--<button class="btn btn-success btn-block">登录</button>--%>
<%--</form>--%>
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
                    alert("进入返回")
                    alert(data)
                    alert(data.name)
                    alert(msg.code)

                    window .location .href = 'http://localhost:8080/user/login';
                }
            });
        });
    });
    // $('#loginForm').on('submit', function (e){
    //             e . preventDefault();
    //             $.ajax( {
    //                 type : "POST",
    //                 dataType: "json",
    //                 url : '/user/ajaxLogin',
    //                 data : $(this) . serialize(),
    //                 success : function (res) {
    //                     alert(res)
    //                     alert("111")
    //                       if ( res== 'ok') {
    //                               alert(res);
    //                               //成功后跳转路由设置
    //                               window . location . href = 'http://localhost:8080/user/login';
    //                            } else {
    //                                        alert(res);
    //                                   $('.span1').html(res)
    //                                }
    //                        }
    //                 });
    //               });

    // function login() {
    //     alert("ajax")
    //     $.ajax({
    //         type: "POST",
    //         url: 'user/ajaxLogin',
    //         data: $('#signupForm').serialize(),
    //         success: function(r) {
    //             if (r==ok) {
    //                 parent.location.href = 'http://localhost:8080/user/login';
    //             } else {
    //                 $.span1.html(r)
    //                 alert(r)
    //                 layer.msg(r);
    //             }
    //         }
    //     });
    // }
</script>
</body>
</html>

