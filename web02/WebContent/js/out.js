//자바 puvlic void login(){}
//파이썬 def login()
function 로그인() {
	id2 = 'root'; //생략시 var // let으로도 가능
	
	id = prompt('아이디 입력')
	
	if (id == id2) { //equals가 없다.
		alert('로그인 성공')
	} else {
		alert('로그인 실패')
	}
}

function 비교() {
	n1 = 100
	n2 = 200
	if (n1 == n2) {
		alert('두수는 동일 합니다')
	}else {
		alert('두수는 동일 하지 않습니다.')
	}
	
	my = prompt('나의 감정 입력')
	friend = prompt('친구의 감정 입력')
	
	if (my == friend) {
		alert('동일합니다.')
	} else {
		alert('동일하지않습니다.')
	}
}


