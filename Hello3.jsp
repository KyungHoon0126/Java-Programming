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
		<p>��Ű�� �����Ǿ����ϴ�. <a href="Hello2.jsp">���ư���</a></p>
	</body>
</html>