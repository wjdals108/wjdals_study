<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<div>내일 내가 작업해야 하는 부분</div>
	<form action="/result" method="get">
		<div>
			<select name="regional_code">
				<c:forEach items="${cd}" var="item">
					<option value="${item.external_cd}">${item.local_nm}</option>
				</c:forEach>
			</select>
		</div>
		<div>
			<select name="deal_year">
				<c:forEach var="i" begin="2000" end="2020">
				<option value="${i}">${i}</option>
				</c:forEach>
			</select>
		</div>		
		<div>
			<select name="deal_month">
				<c:forEach var="i" begin="1" end="12">
				<option value="${i}">${i}</option>
				</c:forEach>
			</select>
		</div>
		<button type="submit">전송</button>
	</form>
</body>
</html>
