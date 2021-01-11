function hobbyChk() {
	var frm = document.querySelector('#frm');
	
	var eleIboard = frm.i_hobby;
	var eleNm = frm.hobby;
	
	if(eleIboard.value == '') {
		alert('i_hobby 값을 입력해 주세요');
		eleIboard.focus();			//커서를 여기로 옮겨준다
		return false;
	} else if(eleNm.value.length == 0) {
		alert('취미를 입력해 주세요');
		eleNm.focus();
		return false;
	}
}

function chkDel(i_hobby) {
	if(confirm(`${i_hobby}번 취미를 삭제 하시겠습니까?`)){
		console.log('dddd');
		location.href = `./DelHobby?i_hobby=${i_hobby}`;
	}
	
}