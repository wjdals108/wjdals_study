<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>디테일</title>
</head>
<body>
	<div>
		<a href="/list">리스트로 돌아가기</a>
		<a href="/del?i_board=${param.i_board}"><button>삭제</button></a>
		<a href="/update?i_board=${param.i_board}"><button>수정</button></a>
	</div>
	<div>
		<div>번호 : ${param.i_board}</div>
		<div>제목 : ${vo.title}</div>
		<div>날짜 : ${vo.r_dt}</div>
		<hr>
		<div>글 내용 : ${vo.ctnt}</div>

	</div>
</body>
</html>