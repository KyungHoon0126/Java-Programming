<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
		
		// 세션에 쓰기
		Date now = new Date();
		session.setAttribute("now", now);
		session.setAttribute("myName",  "김경훈");
		
		// 세션에 읽기
		Date now1 = (Date)session.getAttribute("now");
%>    
    
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="EUC-KR">
			<title>Insert title here</title>
		</head>
		
		<body>
		
		</body>
	</html>