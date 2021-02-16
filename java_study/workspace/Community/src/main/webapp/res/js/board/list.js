function goToDetail(boardPk){
	location.href= `/board/detail?boardPk=${boardPk}`
}

var listContentElem = document.querySelector('#listContent')
var category = listContentElem.dataset.category
var selRowCntElem = document.querySelector('#selRowCnt')
selRowCntElem.addEventListener('change', function(){
	getBoardList(1)
	getMaxPageNum()
})

function getBoardList(page){
	
	if(!page) {
		page = 1
	}
	var rowCnt = selRowCntElem.value;
	
	var info = {
		rowCnt,
		page,
		category	
	}
	sessionStorage.setItem('pageInfo', JSON.stringify(info))
	
	
	fetch(`/board/listData?category=${category}&page=${page}&rowCnt=${rowCnt}`)
	.then(res => res.json())
	.then(myJson => {
		boardProc(myJson)
	})
}

function boardProc(myJson) {
	if(myJson.length === 0) {
		listContentElem.innerHTML = 
		`
		<div>글이 없습니다.</div>
		`
		return
	} 
	
	var table = document.createElement('table')
	table.classList.add('basic-table')
	
	var htr = document.createElement('tr')
	htr.innerHTML = 
	`
		<td>번호</td>
		<td>제목</td>
		<td>조회수</td>
		<td>작성일</td>
		<td>작성자</td>
	`
	table.append(htr)

		
	myJson.forEach(function(item) {
		table.append(createRecord(item))
	})
	
	listContentElem.innerHTML = ''
	listContentElem.append(table)
	
	function createRecord(item) {
		var tr = document.createElement('tr')
		tr.classList.add('record')
		tr.addEventListener('click', function(){
			goToDetail(item.boardPk)
		})
		var td_1 = document.createElement('td')
		var td_2 = document.createElement('td')
		var td_3 = document.createElement('td')
		var td_4 = document.createElement('td')
		var td_5 = document.createElement('td')
		
		td_1.innerText = item.seq
		td_2.innerText = item.title
		td_3.innerText = item.hits
		td_4.innerText = item.regDt
		if(item.profileImg == null){
			td_5.innerHTML = 
			`
				<img id="profileImg" src="/res/img/profile.jpg" alt="프로필 이미지">
				${item.writerNm}
			`	
		} else {
			td_5.innerHTML =
			`
				<img id="profileImg" src="/res/img/user/${item.userPk}/${item.profileImg}" alt="프로필 이미지">
				${item.writerNm}
			`
		}
		
		tr.append(td_1)
		tr.append(td_2)
		tr.append(td_3)
		tr.append(td_4)
		tr.append(td_5)
		
		return tr
	}
	
}

function getMaxPageNum(){
	var rowCnt = selRowCntElem.value;
	fetch(`/board/getMaxPageNum?category=${category}&rowCnt=${rowCnt}`)
	.then(res => res.json())
	.then(myJson => {
		pageProc(myJson)
	})
}

var pagingContentElem = document.querySelector('#pagingContent')
function pageProc(myJson) {
	pagingContentElem.innerHTML = null
	for (let i=1; i<=myJson; i++){
		let span = document.createElement('span')
		span.innerText = i
		span.classList.add('pointer')
		
		if(i===1){
			span.classList.add('selected')
		}
		
		span.addEventListener('click', function(){
			getBoardList(i)
			var selectSpan = document.querySelector('.selected')
			selectSpan.classList.remove('selected')
			/*
			//모든 span의 selected 클래스를 빼준다.
			var spanList = pagingContentElem.children
			for(var z=0; z<spanList.length; z++) {
				spanList[z].classList.remove('selected')
			}
			*/
			span.classList.add('selected')
		})
		pagingContentElem.append(span)
	}
	
}

var page = 1
var pageInfoTxt = sessionStorage.getItem('pageInfo')
if(pageInfoTxt) {
	var pageInfo = JSON.parse(pageInfoTxt)
	page = pageInfo.page
	selRowCntElem.value = pageInfo.rowCnt
}

getBoardList(page)
getMaxPageNum()




