<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<a href="/write">
			<button type="button">글쓰기</button>
		</a>
	</div>
	
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성일자</th>
		</tr>
		<c:forEach items="${list}" var="item">
		<tr>
			<td>${item.i_board}</td>
			<td><a href="/detail?i_board=${item.i_board}">${item.title}</a></td>
			<td>${item.r_dt}</td>			
		</tr>
		</c:forEach>
	</table>
</body>
</html>