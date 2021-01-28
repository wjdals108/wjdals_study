<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/res/css/common.css">
<script defer src="/res/js/<tiles:getAsString name="categoryJs"/>.js"></script>

</head>
<body>
	<div id="container">
		<tiles:insertAttribute name="header" />
		<section>
			<tiles:insertAttribute name="content"/>
		</section>
	</div>
</body>
</html>