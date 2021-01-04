<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//자바 문법을 사용할 수 있는 부분!!
	int n1 = 10;
	int n2 = 20;
	int result = n1 + n2;
	String str = "하하하하";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립틀릿1</title>
</head>
<body>
	<div><% out.print(result); %></div>
	<div><%=result %></div>			<!-- 위의꺼랑 똑같은말임  -->
	<div><%=n1+n2 %></div>
	<div><%=str %></div>
</body>
</html>