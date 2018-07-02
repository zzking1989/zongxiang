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
<form action="" method="post">
<!-- 加载编辑器的容器 -->
<script id="container" name="content" type="text/plain">
        这里写你的初始化内容
    </script>
</form>
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

</script>
</body>

</html>
