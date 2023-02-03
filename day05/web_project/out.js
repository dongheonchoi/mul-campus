function check() {

    passw = document.getElementById('pw').value
    passw2 = document.getElementById('pw2').value

    if ( passw == passw2 ) {
        text = "회원 가입이 완료 되었습니다."
    }
    else{

        text = "비밀번호가 다릅니다. 다시 입력해주세요"

    }

    alert(text)
    
}