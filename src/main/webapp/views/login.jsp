<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file="common/common.jsp" %>
<head>
<script type="text/javascript">
$j(document).ready(function(){
	
	$j("#sub").click(function(){
	    var win = $j.messager.progress({
	         title:'登录中,请稍等........',
	         msg:'Loading data...',
	    });
	     setTimeout(function(){
	           $j.messager.progress('close');
	    },50000)
		
		setTimeout(function(){
			
			$j("#loginForm").submit();
		},3000);
	});
	
});
</script>
<title>用户登录</title>
</head>
<body>
<div align="center" style="margin:160px 0px 0px ">
<div class="easyui-panel" title="登录" style="width:400px">
		<div style="padding:10px 0 10px 60px">
	    <form id="loginForm" action="/home/login.htm" method="post">
	    	<table>
	    		<tr>
	    			<td>用户名:</td>
	    			<td><input class="easyui-validatebox" type="text" name="userName" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td>密码:</td>
	    			<td><input class="easyui-validatebox" type="text" name="password" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td>验证码:</td>
	    			<td><input class="easyui-validatebox" type="text" name="code" data-options="required:true"></input></td>
	    			<td><img border=0 src="../image.jsp"></td>
	    		</tr>
	    		<tr>
	    			<td>角色:</td>
	    			<td>
	    				<select class="easyui-combobox" name="language"><option value="ar">管理员</option><option value="bg">普通用户</option></select>
	    			</td>
	    		</tr>
	    	</table>
	    </form>
	    </div>
	    <div style="text-align:center;padding:5px">
	    	<a href="javascript:void(0)" id="sub" class="easyui-linkbutton">登录</a>
	    	<a href="toRegist.htm" class="easyui-linkbutton">注册</a>
	    </div>
	</div>
</div>
</body>
	
</html>