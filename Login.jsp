<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%
    boolean check = false;

    String id = request.getParameter("id");
    String pw = request.getParameter("pw");

    // 1234로 로그인 가능하게 설정
    if ("1234".equals(pw)) 
    {
        Cookie cookie = new Cookie("bulletin", id);
        response.addCookie(cookie);
        check = true;
    }
%>

<!DOCTYPE html>
<html lang="en">
	<head>
	    <title>쿠키 쓰기</title>
	
	    <style>
	        .header {
	            width: 100%;
	            padding: 10px;
	            border: 1px solid black;
	        }
	        
	        a {
	        	color : red;
	        }
	    </style>
	
	    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	
	    <script>
	        function withId() {
	            location.href = "List.jsp?id=<%= id %>"
	        }
	    </script>
	</head>
	<body>
	    <%
	        if (check == false) {
	    %>
	        <div class="header">
	            <form method="post" action="Login.jsp">
	                Id : <input type="text" name="id"  required="required">
	                Password : <input type="password" name="pw" required="required">
	                <input type="submit" value="로그인">
	            </form>
	        </div>
	
	        <a href="List.jsp"> 비회원으로 글 보기</a>
	    <%
	        } else {
	    %>
	        <h2><%= id %>님 환영합니다! 게시판으로 이동하려면 아래를 클릭해 주세요.</h2>
	        <h4>★★★★★★★★★★★★★</h4>
	        <a  onclick="withId()">★ 글 목록으로 이동하기 ★</a>
	        <h4>★★★★★★★★★★★★★</h4>
	    <%
	        }
	    %>
	</body>
</html>