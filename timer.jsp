<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java"  contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
    
<%
	Date now = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String str = dateFormat.format(now);
%>
    
<!DOCTYPE html>
<html>
	<head>
	<meta charset="EUC-KR">
	<title>시계</title>
	</head>
	
	<body>
		<h1>시계</h1>
		<p><%= str %></p>
	</body>
</html>