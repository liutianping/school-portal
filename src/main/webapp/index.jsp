<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
response.addHeader("Pragma","no-cache");  
response.setHeader("Cache-Control","no-cache");  
response.setIntHeader("Expires",0);  
response.sendRedirect("/home/toLogin.htm");
%>    
