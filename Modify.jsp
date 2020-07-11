<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%
    // 수정할 게시글의 sequence를 얻어온다.
    String sequence = request.getParameter("sequence");
%>

<!DOCTYPE html>
<html lang="en">
	<head>
	    <meta charset="UTF-8">
	    <title>게시글 수정</title>
	
	    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	
	    <script>
	        function save() {
	            var params = {
	            	
            		// Post Sequence
	                sequence : <%= sequence %>,
	                
	                // Post Title
	                title : $("[name = 'title']").val(),
	                
	                // Post Content
	                content :  $("[name = 'content']").val(),
	            }
	            
	            console.log(<%= sequence %>)
	            
	            $.post("/hello/bbs/modify.dgsw", params, function (response) {
	                console.log(response)
	                
	                alert("수정되었습니다.")
	                
	                location.href = "List.html"
	            })
	        }
	    </script>
	</head>
	<body>
	    <h1>게시글 수정</h1>

	    <div>
	        <label>제목</label>
	        <input type="text" name="title">
	    </div>

	    <div>
	        <label>내용</label>
	        <textarea name="content"> </textarea>
	    </div>

    	<div>
        	<button onclick="save()">저장</button>
    	</div>
	</body>
</html>