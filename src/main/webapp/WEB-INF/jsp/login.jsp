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
<form id="form1" onsubmit="return false" action="##" method="post" >
         <table  align="center">
             <tr>
                 <td>用户名：</td>
                 <td colspan="2"><input type="text" name="username" id="username" /></td>
              </tr>
              <tr>
                 <td>密  码：</td>
                 <td colspan="2"><input type="password" name="password" id="password" /></td>
              </tr>

                 <td colspan="3" align="center">
                      <input id="submit" type="submit"  onclick="login()" value="登录"/>
                 </td>
              </tr>
             </tr>
             <td colspan="3" align="center">
                 <span class="span1" id="span1" style="color: brown"></span>
             </td>
             </tr>
          </table>
     </form>
<script>
    function login() {
        var loginFormValues = document.getElementById("form1")
        if (loginFormValues.elements[0].value == "") {
            $(".span1").html("用户名不能为空！");
        } else if (loginFormValues.elements[1].value == "") {
            $(".span1").html("密码不能为空！");
        } else {
            $.ajax({
                type: "POST",//方法类型
                dataType: "",//预期服务器返回的数据类型
                url: "/user/ajaxLogin",//url
                data: $('#form1').serialize(),
                success: function (result) {
                    // console.log(result);//打印服务端返回的数据
                    // alert(result);//弹框
                    if (result.code1 == 1) {
                        window.location.href = '/user/index';
                    } else {
                        $(".span1").html(result.name1);
                    }
                },
                error: function () {
                    alert("异常！");
                }
            });
        }
    }
</script>
</body>
</html>

