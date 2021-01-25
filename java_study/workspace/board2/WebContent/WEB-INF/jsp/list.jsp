<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
</head>
<body>
	<div>
		<a href="/write">
			<button type="button">글쓰기</button>
		</a>
	</div>
	<div>
		<form id="changeRowCnt" action="/list" method="GET" onchange="changeRowCnt()">
			<select name="rowCnt" >
				<option value="5">5</option>
				<option value="8">8</option>
				<option value="10">10</option>
			</select>
		</form>
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
			<td><a href="/detail?i_board=${item.i_board}&page=${param.page}">${item.title}</a></td>
			<td>${item.r_dt}</td>			
		</tr>
		</c:forEach>
	</table>
	
	<div>
		<c:forEach begin="1" end="${page}" var="idx">
			<span><a href="/list?page=${idx}">${idx}</span>
		</c:forEach>
	</div>
	
	<script>
		const count = ${param.rowCnt};
		const option = document.querySelector('#changeRowCnt option[value="' + count + '"]');
		option.selected = true;
		
		function changeRowCnt(){
			var changeRowCnt = document.querySelector('#changeRowCnt');
			changeRowCnt.submit();
			console.log("!");
		}
	</script>
</body>
</html>