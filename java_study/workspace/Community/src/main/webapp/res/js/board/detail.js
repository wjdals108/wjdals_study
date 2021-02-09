var btnDelElem = document.querySelector('#btnDel');
var data = document.querySelector('#data')

if(btnDelElem) {
	btnDelElem.addEventListener('click', function(){
		if(confirm('정말 삭제하시겠습니까?')){
			ajax()
		}
	})	
	
	function ajax() {
		var {pk, category} = data.dataset
		/*
		var pk = data.dataset.pk
		var category = data.dataset.category
		*/ 
		fetch(`/board/del/${pk}`, {
			method: 'delete'
		}).then(function(res){
			return res.json()
		}).then(function(json){
			if(json.data == 1){
				location.href=`/board/list?category=${category}`					
			} else {
				alert('삭제 실패')
			}
		})
	}
}


//------------------------------댓글 부분------------------------------//
var cmtListElem = document.querySelector('#cmtList') //댓글리스트 나타나는 위치
var modalElem = document.querySelector('#modal')
var modCtntElem = document.querySelector('#modCtnt')
var modBtnElem = document.querySelector('#modBtn')
if(modalElem) {
	var modalCloseElem = document.querySelector('#modClose')
	modalCloseElem.addEventListener('click', function() {
		modalElem.classList.add('hide')
	})
}

function selCmtList(){
	
	
	fetch(`/cmt?boardPk=${data.dataset.pk}`)
	.then(res => res.json())
	.then(myJson => {
		clearView()
		createView(myJson)
	})
	
	function clearView() {
		cmtListElem.innerHTML = null
	}
	
	function createView(myJson) {
		if(myJson.length === 0) {
			return
		}
		var tableElem = createTable()
		myJson.forEach(function(item) {
			tableElem.append(createRecord(item))
		})
		
		cmtListElem.append(tableElem)
		
	}
	function createRecord(item) {
		var tr = document.createElement('tr')
		var td_1 = document.createElement('td')
		var td_2 = document.createElement('td')
		var td_3 = document.createElement('td')
		
		td_1.innerText = item.ctnt
		td_2.innerText = item.writerNm
		
		//자신이 쓴 댓글이라면 삭제, 수정 버튼 추가
		var loginuserpk = data.dataset.loginuserpk
		if(loginuserpk == item.writerPk) {
			
			function delAjax() {
				fetch(`/cmt?boardPk=${item.boardPk}&seq=${item.seq}`, {
					method: 'delete'
				}).then(res => res.json())
				.then(myJson => {
					if(myJson === 1) {
						selCmtList()
					} else {
						alert('삭제를 실패하였습니다.')
					}
				})
			}
			
			function modAjax(param) {
				fetch(`/cmt`, {
					method: 'put',
					headers: {
						'Content-Type': 'application/json',
					},
					body: JSON.stringify(param)
				}).then(res => res.json())
				.then(myJson => {
					if(myJson === 1) {
						modalElem.classList.add('hide')
						selCmtList()
					} else {
						alert('수정을 실패하였습니다.')
					}
				})
			}
			
			
			var delBtn = document.createElement('input')
			delBtn.type = 'button'
			delBtn.value = '삭제'
			delBtn.addEventListener('click', function() {
				if(confirm('삭제하시겠습니까?')){
					//삭제처리
					delAjax()
				}
				
			})
			
			var editBtn = document.createElement('input')
			editBtn.type = 'button'
			editBtn.value = '수정'
			editBtn.addEventListener('click', function() {
				//수정할 수 있는 창이 열릴꺼임!!
				modCtntElem.value = item.ctnt
				modalElem.classList.remove('hide')
				
				modBtnElem.onclick = function() {
					var param = {
						boardPk: item.boardPk,
						seq: item.seq,
						ctnt: modCtntElem.value,
					}
					modAjax(param)
				}
			})
			
			td_3.append(delBtn)
			td_3.append(editBtn)
		}
			
		tr.append(td_1)
		tr.append(td_2)
		tr.append(td_3)
		
		return tr;
	}
	
	function createTable() {
		var tableElem = document.createElement('table')
		tableElem.innerHTML = `
		<tr>
			<th>내용</th>
			<th>작성자</th>
			<th>비고</th>		
		</tr>
		`
		return tableElem
		
	}
	
}
selCmtList()

var cmtFrmElem = document.querySelector('#cmtFrm')
if(cmtFrmElem){
	
	var ctntElem = cmtFrmElem.ctnt
	var cmtBtn = document.querySelector('#cmtBtn')
	function ajax() {
		
		if(ctntElem.value === '') {
			alert('댓글 내용이 없습니다.')
			return;
		}
		
		var param = {
			boardPk: data.dataset.pk,
			ctnt: ctntElem.value,
		}
		
		fetch('/cmt', {
			method: 'post',
			headers: {
				'Content-Type': 'application/json',
			},
			body: JSON.stringify(param)
			}).then(function(res) {
				return res.json()
			}).then(function(json){
				if(json===1){
					alert('성공')
					selCmtList()
				}
			})
		}
		cmtBtn.addEventListener('click', ajax)
}
