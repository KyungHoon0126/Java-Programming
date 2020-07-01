<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
		Connection con = null;
		Statement state = null;
		ResultSet rs = null;
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String pw = request.getParameter("pw");
		String gender = request.getParameter("gender");
		String sns = request.getParameter("sns");
		
		// SNS 수신 동의
		int agreeSns;
		
		if (sns == null)
		{
			 sns = "미동의";
			 agreeSns = 0;
		}
		else
		{
			sns = "동의";
			agreeSns = 1;
		}
%>

<%
	try
	{
		Class.forName("org.mariadb.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/jdbc", "root", "#kkh03kkh#");
		
		if(con == null)
		{
			throw new Exception("데이터베이스에 연결 할 수 없습니다. <br>");
		}
		
		System.out.println("데이터베이스에 연결 되었습니다.");
		
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO signup");
		sql.append(" (id, name, pw, gender, sns) ");
		sql.append("VALUES ");
		sql.append("(?, ?, ?, ?, ?) ");
		
		PreparedStatement pstmt = con.prepareStatement(sql.toString());
		pstmt.setString(1,  id);
		pstmt.setString(2, name);
		pstmt.setString(3, pw);
		pstmt.setString(4, gender);
		pstmt.setInt(5, agreeSns);
		
		rs = pstmt.executeQuery();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally 
	{
		
	}
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입 결과(write_save.jsp)</title>
		</head>
		
	<body>
		<p>ID : <%=id%><br>
			   이름 : <%=name%><br>
			   PW : <%=pw%><br>
			   성별 : <%=gender%><br>
			   SNS수신동의 : <%=sns %></p>
	</body>
</html>