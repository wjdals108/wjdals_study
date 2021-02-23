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
	<div>내일 작업해야 하는 부분</div>
	<div>
		<c:forEach items="${list}" var="item">
		${item.local_nm}
		
		</c:forEach>	
	</div>
</body>
</html>