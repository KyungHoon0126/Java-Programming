<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>

<%
		String userName = request.getParameter("name");
		String name = null;
		
		// userName�� ���� ������, cookie�� �� ���� �����Ѵ�.
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
				��������?
				<input type="text" name="name">
				<input type="submit" value=" ����">
			</form>
		</div>

<%
	} 
	else
	{
%>
				
		<div>
			<%= name %>�� �ȳ��ϼ���. 
		</div>
<%
	}
%>
	</body>
</html>