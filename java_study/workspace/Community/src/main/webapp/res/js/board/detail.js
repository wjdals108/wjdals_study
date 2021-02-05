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