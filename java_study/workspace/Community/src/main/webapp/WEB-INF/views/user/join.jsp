<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<div>
	<div><a href="/user/login">Go to Login</a></div>
	
	<form id="frm" action="/user/join" method="post" onsubmit="return chkFrm();">
		<div><input type="text" name="userId" placeholder="ID"><button id="chkIdBtn" type="button">중복체크</button></div>
		<div id="idChkMsg"></div>
		<div><input type="password" name="userPw" placeholder="PASSWORD"></div>
		<div><input type="password" name="userPwRe" placeholder="CONFIRM PASSWORD"></div>
		<div><input type="text" name="nm" placeholder="NAME"></div>
		<div>Gender : 
			<label>Woman<input type="radio" name="gender" value="0" checked></label>
			<label>Man<input type="radio" name="gender" value="1"></label>
		</div>
		<div><input type="submit" value="Join"></div>
	</form>
</div>