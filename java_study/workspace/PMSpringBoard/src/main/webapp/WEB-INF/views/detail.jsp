<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${vo.title}</title>
<link rel="stylesheet" href="res/css/common.css">
<script defer src="/res/js/common.js"></script>
</head>
<body>
	<div>
		<div>
			<a href="/list">리스트로 돌아가기</a>
		</div>
		<button data-id="${param.i_board}" id="delBtn">삭제</button>
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