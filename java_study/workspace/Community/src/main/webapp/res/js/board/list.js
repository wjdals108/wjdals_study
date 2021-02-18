function goToDetail(boardPk){
	location.href= `/board/detail?boardPk=${boardPk}`
}

var gPage = 1
var listContentElem = document.querySelector('#listContent')
var category = listContentElem.dataset.category
var selRowCntElem = document.querySelector('#selRowCnt')	//글갯수
var selSearchTypeElem = document.querySelector('#selSearchType')	//검색타입
var txtSearchTextElem = document.querySelector('#txtSearchText')	//검색어
var gSearchText = ''
selRowCntElem.addEventListener('change', function(){
	getBoardList(1)
	getMaxPageNum()
})

txtSearchTextElem.addEventListener('keyup', function(e) {
	if(e.keyCode === 13) {		//엔터키누른거임
		search()
	}
})

function getBoardList(page){
	
	if(!page) {
		page = 1
	}
	var rowCnt = selRowCntElem.value;
	var searchType = selSearchTypeElem.value
	var searchText = txtSearchTextElem.value
	
	var info = {
		rowCnt,
		page,
		searchText,
		searchType,
	}
	gPage = page
	sessionStorage.setItem('pageInfo', JSON.stringify(info))
	
	
	
	fetch(`/board/listData?category=${category}&page=${page}&rowCnt=${rowCnt}&searchType=${searchType}&searchText=${searchText}`)
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
	
	var searchType = selSearchTypeElem.value
	var searchText = txtSearchTextElem.value
		
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
		
		let title = item.title
		let writerNm = item.writerNm
		
		//하이라이트 처리
		if(searchText !== ''){
			switch(searchType) {
				case '1':				//제목
				case '3':				//제목+내용
				title = setHighlight(title, searchText)
				break
				case '4':				//작성자
				writerNm = setHighlight(writerNm, searchText)
				break
			}
		}
		
		td_1.innerText = item.seq
		td_2.innerHTML = title
		td_3.innerText = item.hits
		td_4.innerText = item.regDt
		td_5.innerHTML =
		`
			<img id="profileImg" src="/res/img/user/${item.userPk}/${item.profileImg}" alt="프로필 이미지" onerror="this.src='/res/img/profile.jpg'">
			${writerNm}
		`
		

		/*
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
		*/
		
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
	var searchType = selSearchTypeElem.value
	var searchText = txtSearchTextElem.value
	
	
	fetch(`/board/getMaxPageNum?category=${category}&rowCnt=${rowCnt}&searchType=${searchType}&searchText=${searchText}`)
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
		
		if(gPage===i){
			span.classList.add('selected')
		}
		
		span.addEventListener('click', function(){
			if(gSearchText) {
				txtSearchTextElem.value = gSearchText
			} else {
				txtSearchTextElem.value = ''
			}
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


var pageInfoTxt = sessionStorage.getItem('pageInfo')
if(pageInfoTxt) {
	var pageInfo = JSON.parse(pageInfoTxt)
	gPage = pageInfo.page
	selRowCntElem.value = pageInfo.rowCnt
	selSearchTypeElem.value = pageInfo.searchType
	txtSearchTextElem.value = pageInfo.searchText
	search(pageInfo.page)
}  else {
	search()
}

function search(page = 1){
	gSearchText = txtSearchTextElem.value
	gPage = page
	getBoardList(page)
	getMaxPageNum()	
}




