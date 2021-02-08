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

function selCmtList(){
	fetch(`/cmt?boardPk=${data.dataset.pk}`)
	.then(res => res.json())
	.then(myJson => {
		createView(myJson)
	})
	
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
		td_2.innerText = item.writerPk
		
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
		</tr>`
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
				}
			})
		}
		cmtBtn.addEventListener('click', ajax)
}
