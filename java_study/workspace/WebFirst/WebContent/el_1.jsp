<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//내장객체 set, get Attribute가 있는 친구가 4개!
	//pageContext, request, session, application
	pageContext.setAttribute("name", "순일이");		//우선순위가 제일 높다		//jsp 파일이 열리는순간 살아있음.
	request.setAttribute("name", "홍길동");			//우선순위 2			//얘는 요청을 보낼때마다 살아있음. 응답하면 죽음. 1회성이라 생각하면 됨
	session.setAttribute("name", "도흠이");			//우선순위 3			//얘는 브라우저를 켜는순간 살고 브라우저를 끌때까지 계속 가지고 있음 로그인 생각하면 됨 브라우저 켜져있는동안은 계속 로그인되있다.
	application.setAttribute("name", "유정이");		//우선순위 4			//얘는 서버 죽을때 죽음. 거의 안쓴다
	//pageContext, request, session은 개인용 
	//application은 공용
	//서버가 기동되면 application은 객체가 딱 1개만 만들어짐
	//나머지 3개는 각자 만들어지는데 scope 범위가 다르다
	//근데 하는일은 똑같음. 값 담아주고 값 가져오고
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el_1</title>
</head>
<body>
	<div>${param.n1} + ${param.n2} = ${param.n1+param.n2}</div>			 <!-- $를 사용하여 하는게 EL식이라고 한다. param.을 쓰면 쿼리스트림 쓸때만 값을 가져 올 수 있다. -->
	<div>${name}</div>													<!-- .param을 안쓰는거는 setAttribute로 담아준거만 할 수 있음. 위에서 String str = "ddd"; 이렇게 썼다고 ${str}이렇게 못쓴다는 얘기임  str은 scriptlet에서 썼던방법으로만 쓸 수 있다.-->
</body>
</html>