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
<h1>测试富文本输入</h1>
<!-- 配置文件 -->
<script type="text/javascript" src="../ueditor/ueditor.config.js"></script>
<!-- 编辑器源码文件 -->
<script type="text/javascript" src="../ueditor/ueditor.all.js"></script>
<!-- 实例化编辑器 -->
<script type="text/javascript">
    // 默认列表
    // var ue = UE.getEditor('container');
    // 简单列表
    var ue = UE.getEditor('container', {
        toolbars: [
            [
                //字体
                // 'anchor', //锚点
                'fontfamily', //字体
                'fontsize', //字号
                'indent', //首行缩进
                'undo', //撤销
                'redo', //重做
                'bold', //加粗
                'italic', //斜体
                'underline', //下划线
                'strikethrough', //删除线
                'fontborder', //字符边框
                'subscript', //下标
                'superscript', //上标
                'touppercase', //字母大写
                'tolowercase', //字母小写
                'forecolor', //字体颜色
                //段落
                'lineheight', //行间距
                // 'paragraph', //段落格式
                // 'customstyle', //自定义标题
                'justifyleft', //居左对齐
                'justifycenter', //居中对齐
                'justifyright', //居右对齐
                'justifyjustify', //两端对齐
                // 'insertorderedlist', //有序列表
                // 'insertunorderedlist', //无序列表
                // 'directionalityltr', //从左向右输入
                // 'directionalityrtl', //从右向左输入
                // 'rowspacingtop', //段前距
                // 'rowspacingbottom', //段后距
                'pagebreak', //分页
                //整体效果
                // 'autotypeset', //自动排版
                'fullscreen', //全屏
                'backcolor', //背景色
                'horizontal', //分隔线
                'removeformat', //清除格式
                'selectall', //全选
                'cleardoc', //清空文档

                //图片
                'simpleupload', //单图上传
                'insertimage', //多图上传
                'imagenone', //默认
                'imageleft', //左浮动
                'imageright', //右浮动
                'imagecenter', //居中
                //表格类
                // 'inserttable', //插入表格
                // 'insertrow', //前插入行
                // 'insertcol', //前插入列
                // 'mergeright', //右合并单元格
                // 'mergedown', //下合并单元格
                // 'deleterow', //删除行
                // 'deletecol', //删除列
                // 'splittorows', //拆分成行
                // 'splittocols', //拆分成列
                // 'splittocells', //完全拆分单元格
                // 'deletecaption', //删除表格标题
                // 'inserttitle', //插入标题
                // 'mergecells', //合并多个单元格
                // 'edittd', //单元格属性
                // 'deletetable', //删除表格
                // 'edittable', //表格属性
                // 'insertparagraphbeforetable', //"表格前插入行"
                //工具
                'date', //日期
                'time', //时间
                'link', //超链接
                'unlink', //取消链接
                'emotion', //表情
                'spechars', //特殊字符
                'map', //Baidu地图

                //其他
                // 'insertcode', //代码语言
                // 'formatmatch', //格式刷
                // 'source', //源代码
                // 'blockquote', //引用
                // 'pasteplain', //纯文本粘贴模式
                // 'print', //打印
                // 'preview', //预览
                // 'searchreplace', //查询替换
                // 'gmap', //Google地图
                // 'insertvideo', //视频
                // 'wordimage', //图片转存
                // 'edittip ', //编辑提示
                // 'charts', // 图表
                // 'insertframe', //插入Iframe
                // 'attachment', //附件
                // 'webapp', //百度应用
                // 'snapscreen', //截图
                // 'background', //背景
                // 'template', //模板
                // 'scrawl', //涂鸦
                // 'music', //音乐
                // 'drafts', // 从草稿箱加载

                'help', //帮助
            ]
        ],
        autoHeightEnabled: true,
        autoFloatEnabled: true
    });
</script>



<form  method="post" id="u" action="/post/save" >
<textarea id="container" name="contents" style="width: 70%">UEditor Demo</textarea>
<input type="submit"  value="提交"/>
</form>

</body>

</html>
