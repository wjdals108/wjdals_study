var btnDelElem = document.querySelector('#btnDel');
var boardPk = document.querySelector('#data').dataset.pk

if(btnDelElem) {
	btnDel.addEventListener('click', function(){
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
		})
	}
	
	
}