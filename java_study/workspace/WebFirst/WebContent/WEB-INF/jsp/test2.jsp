<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글등록</title>
</head>
<body>
	<form action="/test2?msg=ddd" method="post">
		<div><input type="text" name="title" placeholder="제목"></div>
		<div><textarea name="ctnt"></textarea></div>
		<div>
			<input type="submit" value="글등록">
			<input type="reset" value="다시작성">
		</div>
	</form>
</body>
</html>