function hobbyChk() {
	var frm = document.querySelector('#frm');
	var eleNm = frm.hobby;
	
	if(eleNm.value.length == 0) {
		alert('취미를 입력해 주세요');
		eleNm.focus();
		return false;
	}
}

function chkDel(i_hobby) {
	if(confirm(`${i_hobby}번 취미를 삭제 하시겠습니까?`)){				//여기 $ 이거 jsp 파일에서 <script>태그 열고 쓰면은 el식으로 알아먹어서 못알아먹는다 똑같이 그렇게 쓰고 싶으면 \ 요거 $앞에 붙여줘야한다.
		console.log('dddd');
		location.href = `./DelHobby?i_hobby=${i_hobby}`;
	}
}