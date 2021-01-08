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
	<table>
		<tr>
			<th>id<th>
			<th>취미명<th>
		</tr>
	<% for(HobbyEntity vo : list) {	%>
		<tr>
			<td><%=vo.getI_hobby() %><td>
			<td><%=vo.getNm() %><td>
		</tr>
	<% } %>
	</table>
</body>
</html>