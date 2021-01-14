<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정</title>
</head>
<body>
	<form action="/update" method="post">
		<input type="hidden" name="i_board" value="${param.i_board}">
		<div><input type="text" name="title" value="${vo.title}"></div>
		<div><textarea name="ctnt">${vo.ctnt}</textarea></div>
		<div>
			<input type="submit" value="수정">
			<input type="reset" value="다시 작성">
		</div>
	</form>
</body>
</html>