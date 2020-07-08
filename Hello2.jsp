<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>

<%
		String value = null;

		Cookie[] cookies = request.getCookies();
		
		for(Cookie cookie : cookies)
		{
				if(cookie.getName().equals("name_cookie"))
				{
					value = cookie.getValue();
					break;
				}
		}
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	
	<body>
		<form method="get" action="Hello3.jsp">
			<p>Cookie value : <%= value %></p>	
			<input type="submit" value="쿠키삭제">
		</form>
	</body>
</html>