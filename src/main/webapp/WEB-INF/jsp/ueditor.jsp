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
<html lang="en-US">
<head>
    <meta charset="UTF-8">
    <title>ueditor demo</title>
</head>

<body>
<h1>测试测试测试</h1>
    <%--<!-- 加载编辑器的容器 -->--%>
    <%--<script id="container" name="content" type="text/plain">--%>
    <%--这里写你的初始化内容--%>
    <%--</script>--%>
<!-- 配置文件 -->
<script type="text/javascript" src="../js/ueditor/ueditor.config.js"></script>
<!-- 编辑器源码文件 -->
<script type="text/javascript" src="../js/ueditor/ueditor.all.js"></script>
<!-- 实例化编辑器 -->
<script type="text/javascript">
    // 默认列表
    var ue = UE.getEditor('container');
    // // 简单列表
    // var ue = UE.getEditor('container', {
    //     toolbars: [
    //         ['fullscreen', 'source', 'undo', 'redo', 'bold']
    //     ],
    //     autoHeightEnabled: true,
    //     autoFloatEnabled: true
    // });


    // UE.Editor.prototype._bkGetActionUrl ? "" : UE.Editor.prototype._bkGetActionUrl = UE.Editor.prototype.getActionUrl;
    // UE.Editor.prototype.getActionUrl = function(action) {
    //     //这里很重要，很重要，很重要，要和配置中的imageActionName值一样
    //     if (action == 'uploadImage'){
    //         //这里调用后端我们写的图片上传接口
    //         return '/post/uploadImage';
    //     }else{
    //         return this._bkGetActionUrl.call(this, action);
    //     }
    // }

</script>



<form  method="post" id="u" action="/post/save" >
<textarea id="container" name="contents">UEditor Demo</textarea>
<input type="submit"  value="提交"/>
</form>

</body>

</html>


<%--<!DOCTYPE HTML>--%>
<%--<html lang="en-US">--%>
<%--<head>--%>
    <%--<meta charset="UTF-8">--%>
    <%--<title>ueditor demo</title>--%>
    <%--<script type="text/javascript" src="../js/jquery-2.2.0.min.js" ></script>--%>
    <%--<!-- 配置文件 -->--%>
    <%--<script type="text/javascript" src="../js/ueditor/ueditor.config.js"></script>--%>
    <%--<!-- 编辑器源码文件 -->--%>
    <%--<script type="text/javascript" src="../js/ueditorueditor.all.js"></script>--%>
    <%--<script>--%>
        <%--$(function(){--%>
            <%--//实例化编辑器--%>
            <%--var ue = UE.getEditor('container');--%>
        <%--})--%>
    <%--</script>--%>
<%--</head>--%>
<%--<body>--%>
<%--<form action="/post/save" method="get">--%>
    <%--<textarea id="container" name="contents">UEditor Demo</textarea>--%>
    <%--<input type="submit" value="submit" />--%>
<%--</form>--%>
<%--</body>--%>
<%--</html>--%>