<%@page import="kr.hs.dgsw.c1.Counter"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
    
 <%
 	Counter.increaseCount();
	int count = Counter.getCount();
 %>   
    
<!DOCTYPE html>
<html>
	<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
	</head>
	
	<body>
		<p><%= count %></p>
	</body>
</html>