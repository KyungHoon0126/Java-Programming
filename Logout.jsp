<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
    
<%
		Cookie cookie = new Cookie("bulletin", "");
  		cookie.setMaxAge(0);
  		response.addCookie(cookie);
  %>
    
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
		
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		
		<script>
				$(document).ready(function() {
					location.href = "/java_project/bbs/List.jsp"
					
					alert("로그아웃되었습니다.");
			});
		</script>
	</head>
	
	<body>
		
	</body>
</html>