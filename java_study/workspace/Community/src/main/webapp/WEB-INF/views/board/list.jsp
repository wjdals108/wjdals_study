<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<h1>카테고리 이름</h1>
<div>
	<c:if test="${sessionScope.loginUser != null}">
	<a href="/board/write?category=${param.category}">
		<button>글쓰기</button>
	</a>
	</c:if>
</div>
<div>
	<c:choose>
		<c:when test="${fn:length(requestScope.list) == 0}">
			<div>글이 없습니다.</div>
		</c:when>
		<c:otherwise>
			<table class="basic-table">
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>조회수</th>
					<th>작성일</th>
					<th>작성자</th>
				</tr>
				<c:forEach items="${requestScope.list}" var="list">
				<tr class="record" onclick="goToDetail(${list.boardPk})">
					<td><c:out value="${list.seq}"/></td>
					<td><c:out value="${list.title}"/></td>
					<td><c:out value="${list.hits}"/></td>
					<td><c:out value="${list.regDt}"/></td>
					<td><c:out value="${list.writerNm}"/></td>
				</tr>
				</c:forEach>
			</table>
			
		</c:otherwise>
	</c:choose>
</div>
<div>
	페이징할 부분
</div>

<script src="/res/js/board/list.js"></script>