var id = document.querySelector('#id');
var pw = document.querySelector('#pw');
var pwcheck = document.querySelector('#pwcheck');

function login(){
    if(id.value=='' || pw.value==''){
        alert('로그인을 할 수 없습니다.');
    }
    else{
        location.href = './main.html'
    }
}

function back(){
    history.back();
}

function join(){
    if(id.value=='' || pw.value=='' || pwcheck.value==''){
        alert('회원가입을 할 수 없습니다.');
    }
    else{
        if(pw.value!=pwcheck.value){
            alert('비밀번호를 확인해 주세요.')
        }
        else{
            location.href = './login.html'
        }
    }
}