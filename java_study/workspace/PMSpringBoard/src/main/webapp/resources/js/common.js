function moveToDeTAIL(i_board) {
	location.href= '/detail?i_board=' + i_board;
}

var delBtn = document.querySelector('#delBtn');
if(delBtn) {
	delBtn.addEventListener('click', function() {
		location.href = `/del?i_board=${this.dataset.id}`;
	});	
}