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
		<a href=""><button>수정</button></a>
	</div>
	<div>
		<table>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>글 내용</th>
				<th>날짜</th>
			</tr>
			<tr>
				<td>${param.i_board}</td>
				<td>${vo.title}</td>
				<td>${vo.ctnt}</td>
				<td>${vo.r_dt}</td>
			</tr>
		</table>
	</div>
</body>
</html>