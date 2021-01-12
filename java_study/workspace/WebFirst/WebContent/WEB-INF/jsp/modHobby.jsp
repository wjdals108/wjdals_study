<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form id="frm" action="/modHobby" method="post" onsubmit="return hobbyChk();">
			<label>i_hobby : <input type="hidden" name="i_hobby" value="${param.i_hobby}" readonly></label>
			<label>취미 : <input type="text" name="hobby" value="${data.nm}"></label>
			<button type="submit">등록</button>
		</form>
	</div>
	
	
	<script src="./js/common.js"></script>
</body>
</html>