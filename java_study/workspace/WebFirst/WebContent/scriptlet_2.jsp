<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//이부분은 자바를 작성하는거다
	//그리고 여기부분은 결국 마지막에 html부분까지 포함해서 통째로 메소드에 들어가는 거기 때문에
	//여기서는 메소드를 만들 수 없다.
	//why? 자바에서는 메소드 안에 메소드를 만들 수 없기때문에
	//그럼 메소드 만들고 싶을때 우째야 할까?
	//밑에처럼 하면 됨
%>

<%!		//요렇게 하면 전역변수로 만든다 이런뜻이기때문에 메소드 만들수 있음
	int a = 10;
	private int sum(int n1, int n2){
		return n1 + n2;
	}
%>

<%
	int a = 20;
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립틀릿2</title>
</head>
<body>
	<div><%=sum(10,40) %></div>
	<div><%=a %></div>						<!-- 20이 찍힌다 -->
	<div><%=this.a %></div>
</body>
</html>