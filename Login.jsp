<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
		HttpSession session1 = request.getSession();
		

		boolean authorized = false;

		String job = request.getParameter("job");
		String userId = null;
		String failMessage = null;
		
		if("Login".equals(job))
		{
				// 로그인
				String id = request.getParameter("id");
				String password = request.getParameter("password");
				
				if("1234".equals(password))
				{
					// Cookie cookie = new Cookie("dgsw_id", id);
					// response.addCookie(cookie);
					
					session.setAttribute("dgsw_id", id);
					
					response.sendRedirect("Login.jsp");
				}
				else
				{
					failMessage = "비밀번호가 올바르지 않습니다.";			
				}
				
		}
		else if("Logout".equals(job))
		{
			// Cookie cookie = new Cookie("dgsw_id", "");
			// cookie.setMaxAge(0);
			// response.addCookie(cookie);
			
			session.removeAttribute("dgsw_id");
			
			response.sendRedirect("Login.jsp");
		}
		
		// 로그인 여부 검사
		/* Cookie[] cookies = request.getCookies();
		
		if(cookies != null)
		{
			for(Cookie cookie : cookies)
			{
				if("dgsw_id".equals(cookie.getName()))
				{	
					authorized = true;
					userId = cookie.getValue();
					break;
				}
			}
		} */
		
	    userId = (String) session.getAttribute("dgsw_id");
		
		if(userId != null)
		{
			authorized = true;	
		}
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Login</title>
		
		<style>
			.header {
				width: 98%;
				padding: 10px;
				border: 1px solid #CCC;
			}
		</style>
	</head>
	
	<body>
<%
		if(!authorized)
		{
%>
		<div class="header">
			<form method="POST" action="/hello/CookieLogin/Login.jsp">
				ID : <input type="text" name="id">
				Password : <input type="password"  name="password">
				<input type="hidden" name="job" value="Login">
				<input type="submit" value="로그인" >
			</form>
		</div>
<%
		}
		else {
%>
		<div class="header">
			<form method="POST" action="Login.jsp">
				<%= userId %>님 환영합니다.
				<input type="hidden" name="job" value="Logout">
				<input type="submit" value="로그아웃">
			</form>
		</div>
<%
				}
%>

<%
		if(failMessage != null)
		{
%>
		<script>
			alert(<%= failMessage%>);
		</script>				
<%
		}
%>
	</body>
</html>