<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// 글 번호가 필요하므로 하므로 sequence를 얻어 온다.
	String sequence = request.getParameter("sequence");
%>

<!DOCTYPE html>
<html>
	<head>
			<meta charset="UTF-8">
			<title>게시판</title>
			
			<style>
				label {
					display: inline-block;
					width: 100px;
				}
				
				div {
					padding: 5px;
				}
			</style>
			
			<script 
					src ="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js">
			</script>
			
			<script>
				$(document).ready(function() {
					readWriting();
				});
			
				function readWriting() {
					$.get("read.dgsw", {sequence: <%= sequence %>}, 
							function(response) {
						showWriting(response);
					});
				}
				
				function showWriting(writing) {
					$("#title").html(writing.title);
					$("#content").html(writing.content);
					$("#writer").html(writing.writer);
				}
				
				function modify() {
					// 게시글을 수정할 Modify.jsp로 이동
					location.href = "Modify.jsp?sequence=" 
							+ <%= sequence %>
				}
			</script>
	</head>
	
	<body>
		<h1>게시판 - 글읽기</h1>
		
		<div>
			<label>제목</label>
			<span id="title">안녕하세요</span>
		</div>
	
		<div>
			<label>내용</label>
			<textarea id="content">반갑습니다.</textarea>
		</div>
	
		<div>
			<label>글쓴이</label>
			<span id="writer">홍길동</span>
		</div>
		
		<div>
			<button onclick="modify()">수정하기</button>
			<button>삭제하기</button>
		</div>
	</body>
</html>