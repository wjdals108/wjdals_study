<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List" %>
<%@ page import="com.koreait.board.model.BoardEntity" %>
    
<% List<BoardEntity> list = (List)request.getAttribute("list"); %>
<% int pageLength = (Integer)request.getAttribute("pageLength"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
<style>
	* {
		box-sizing: border;	
	}
	
	body {
		margin: 0;
		padding: 0;
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
	}
	
	.table-container{
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		width: 100%;
		position: relative;
	}
	
	.write {
		width: 100%;
		display: flex;
		justify-content: flex-end;
	}

	table{
		border-collapse: collapse;
		width: 100%;
	}
	
	table, tr{
		border: 1px solid black;
	}
	
	tbody>tr {
		cursor: pointer;
	}
	
	ul {
		width: 100%;
		margin: 0;
		padding: 0;
		list-style: none;
		display: flex;
		justify-content: center;
	}
	
	li {
		margin: 20px;
	}
	
</style>
</head>
<body>
	<div class="write">
		<a href="/write">
			<button>글쓰기</button>
		</a>
	</div>	
	<div class="table-container">
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
				<tr onclick="location.href='/detail?page=${param.page}&i_board=<%=vo.getI_board()%>'">
					<td><%=vo.getI_board() %></td>
					<td><%=vo.getTitle() %></td>
					<td><%=vo.getR_dt() %></td>
				</tr>
				<% } %>
			</tbody>
		</table>
		<div class="pagingContainer">
			<ul>
			<% for(int i=0; i<pageLength; i++) { %>
				<li><a href="/list?page=<%=i+1%>"><%=i+1%></a></li>
			<% } %>
			</ul>
		</div>
	</div>
</body>
</html>