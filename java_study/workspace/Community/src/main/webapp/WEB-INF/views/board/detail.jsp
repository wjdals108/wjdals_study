<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
	<div>
		<a href="/board/list?category=${requestScope.data.category}">리스트로 돌아가기</a>
	</div>
		
	<c:if test="${sessionScope.loginUser.userPk == requestScope.data.userPk}">
		<div>
			<a href="/board/edit?category=${requestScope.data.category}&boardPk=${requestScope.data.boardPk}">
				<button>수정</button>
			</a>
			<button id="btnDel">삭제</button>
		</div>
	</c:if>
	
	<div id="data" data-loginuserpk="${sessionScope.loginUser.userPk}" data-pk="${requestScope.data.boardPk}" data-category="${requestScope.data.category}">
		<div>번호 : ${requestScope.data.seq}</div>
		<div>제목 : ${requestScope.data.title}</div>
		<div>날짜 : ${requestScope.data.regDt}"</div>
		<div>조회수 : ${requestScope.data.hits}</div>
		<div>작성자 : ${requestScope.data.writerNm}</div>
		<hr>
		<div>글 내용 : ${requestScope.data.ctnt}</div>
	</div>
	<c:if test="${sessionScope.loginUser != null}">
	<div>
		<form id="cmtFrm" onsubmit="return false">
			<input type="text" name="ctnt">
			<input id="cmtBtn" type="button" value="댓글등록">	
		</form>
	</div>
	
	<div id="modal" class="hide">
		<div class="modal-content">
			<span id="modClose">X</span>
			<input type="text" id="modCtnt">
			<input id="modBtn" type="button" value="수정">
		</div>
	</div>
	
	</c:if>
	<div id="cmtList">
	
	</div>
	
	
<script src="/res/js/board/detail.js"></script>