<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>

<%
		String userName = request.getParameter("name");
		String name = null;
		
		// userName에 값이 있으면, cookie에 그 값을 저장한다.
		if(userName != null && userName.length() > 0)
		{
			Cookie cookie = new Cookie("name_cookie", userName);
			cookie.setMaxAge(24 * 60 * 60);
			response.addCookie(cookie);
		}
 %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	
	<body>
<%
	if(name == null || name.length() == 0)
	{
%>
		<div>
			<form method="GET" action="Hello1.jsp">
				누구세요?
				<input type="text" name="name">
				<input type="submit" value=" 제출">
			</form>
		</div>

<%
	} 
	else
	{
%>
				
		<div>
			<%= name %>님 안녕하세요. 
		</div>
<%
	}
%>
	</body>
</html>