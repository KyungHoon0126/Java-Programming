<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
    
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>회원 가입(write.jsp)</title>
	</head>
	
	<body>
		<form method="GET" action="result.jsp">
			<fieldset>
				<legend>회원정보입력</legend>
					ID : <input type="text" required="required" name="id"><br>
					이름 : <input type="text" required="required" name="name"><br>
					PW : <input type="text" required="required" name="pw"><br>
					성별 : <input type="radio" name="gender" value="man"> 남자 <input type="radio" name="sex" value="women">여자<br>
					SNS수신동의 : <input type="checkbox" name="sns" value="agree"> 동의<br>
			<input type="submit" name="submit" value="제출">
		 </fieldset>
		 </form>   
	</body>
</html>