<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file="common/common.jsp" %>
<head>
<script type="text/javascript">
$j(document).ready(function(){
	
	//欢迎
	$j.messager.show({
		title : '系统提示',
		msg : '欢迎进入管理平台!',
		timeout : 5000,
		showType : 'slide'
	});


	/* $j(".level1").click(function(){
	       var value = $j(this).text();
	       var url = $j(this).attr("url");
	       alert("value");
	       alert("url");
	       //如果tab存在  允许再次打开
	       if ($j("#tabs").tabs('exists',value)) {
	    	   $j.messager.alert('提示','不能重复打开操作界面!','question');
	    	   return;
	       }
	       
	       $j('#tabs').tabs('add',{
	            title: value,
	            closable: true,
	            href : url
	       });
	}); */
});
</script>
<title>管理平台</title>
</head>
<body class="easyui-layout">
	    <!-- 北 -->
		<%@ include file="top.jsp" %>
		
		<!-- 左侧tree -->
		<%@include file="left.jsp" %>
		
		<!-- 数据展示区 -->
		<div region="center" title="操作区" style="overflow:hidden;">
			<div id="tabs" class="easyui-tabs" fit="true" border="false">
			</div>
		</div>
</body>
</html>