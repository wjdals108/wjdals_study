<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List" %>
<%@ page import="com.koreait.webfirst.HobbyEntity" %>

<%
	List<HobbyEntity> list = (List)request.getAttribute("list");			//getAttribute는 object 타입으로 나온다. why? set해줄때도 object로 들어가니깐 -> 무슨말이냐면 set할때 int, float, String, boolean 모든타입 다 넣을수있다 이거는 object로 들어간다는 말이다
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hobby</title>
</head>
<body>
	<h1>hobby</h1>
	<div>
		<form id="frm" action="/hobby" method="post" onsubmit="return hobbyChk();">						<!-- get은 화면띄우기 담당 pos는 데이터 처리 라고 생각하자 -->
			<label>취미 : <input type="text" name="hobby"></label>	<!-- name이 key, 적히는 값이 value  -->
			<button type="submit">등록</button>
		</form>
		
		
		<!--  
		<form action="/hobby" method="post">
			<label>삭제하고 싶은 i_hobby를 입력하세요 : <input type="text" name="i_hobby"></label>
			<button type="submit">등록</button>
		</form>
		-->
		
	</div>
	<table>
		<tr>
			<th>id<th>
			<th>취미명<th>
			<th></th>
		</tr>
	<% for(HobbyEntity vo : list) {	%>
		<tr>
			<td><%=vo.getI_hobby() %><td>
			<td><%=vo.getNm() %><td>
			<td>
				<button onclick="chkDel(<%=vo.getI_hobby() %>)">삭제</button>
				<a href="/modHobby?i_hobby=<%=vo.getI_hobby() %>"><button>수정</button></a>
			</td>
			
		</tr>
	<% } %>
	</table>
	
	<script src="./js/common.js"></script>
</body>
</html>