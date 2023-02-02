function hi() {
    alert('안녕하세요!!')
}
function bye() {
    alert('안녕히가세요!!')
}

function check() {
    // 유저의 아이디와 비밀번호 정보
    id = "a"
    pw = "1234"
    // id로 태그를 가져와라 <input type="text" id = "id2" value = "root">를 전부 가져온다.
    id2 = document.getElementById('id2').value  //.value를 붙이면 value 값만 가져온다.
    pw2 = document.getElementById('pw2').value 


    result = document.getElementById('result')


    if (id == id2 && pw == pw2) {
        // alert('로그인 성공')
        result.innerHTML = '<font color=red>로그인 성공!!!</font>'
    
    }
    else {
        // alert('로그인 실패')
        result.innerHTML = '<font color=blue>로그인 실패!!!</font>'
    }
}