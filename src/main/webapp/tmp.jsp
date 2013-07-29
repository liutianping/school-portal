<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file="views/common/common.jsp" %>
<head>
<title>管理平台</title>
<script type="text/javascript">
$j(document).ready(function(){
	$j('#test').click(function(){
		alert(123);
	});
});

</script>
</head>
<body >
<select id="test">
<option value="1">选项一<option>
<option value="2">选项一<option>
<option value="3">选项3<option>
</select>
</body>
</html>