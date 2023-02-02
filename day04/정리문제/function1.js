function check() {

    // id로 태그를 가져와라 <input type="text" id = "id2" value = "root">를 전부 가져온다.
    pw2 = document.getElementById('pw2').value  //.value를 붙이면 value 값만 가져온다.
    pw3 = document.getElementById('pw3').value 


    //result = document.getElementById('result')


    if (pw2 == pw3 ) {
        // alert('로그인 성공')
        result.innerHTML = '<font color=red>패스워드 일치!!!</font> <img src = "ok(1).jpg" width=100 height=100>'
    
    }
    else {
        // alert('로그인 실패')
        result.innerHTML = '<font color=blue>패스워드 불일치!!!</font>'
    }
}

function len() {

    id10 = document.getElementById('id2').value
    alert(id10.length)

}