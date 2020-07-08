<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
    
  <%
		Cookie cookie = new Cookie("name_cookie", "anything");
  		cookie.setMaxAge(0);
  		response.addCookie(cookie);
  %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	
	<body>
		<p>쿠키가 삭제되었습니다. <a href="Hello2.jsp">돌아가기</a></p>
	</body>
</html>