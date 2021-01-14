<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List" %>
<%@ page import="com.koreait.board.model.BoardEntity" %>
    
<% List<BoardEntity> list = (List)request.getAttribute("list"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
<style>
	table{
		border-collapse: collapse;
	}
	
	table, tr{
		border: 1px solid black;
	}
</style>
</head>
<body>
	<div>
		<a href="/write">
			<button>글쓰기</button>
		</a>
	</div>
	<div>
		<table>
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>등록일시</th>
				</tr>
			</thead>
			<tbody>
				<% for(BoardEntity vo : list) {	%>
				<tr onclick="location.href='/detail?i_board=<%=vo.getI_board()%>'">
					<td><%=vo.getI_board() %></td>
					<td><%=vo.getTitle() %></td>
					<td><%=vo.getR_dt() %></td>
				</tr>
				<% } %>
			</tbody>
		</table>
	</div>
</body>
</html>