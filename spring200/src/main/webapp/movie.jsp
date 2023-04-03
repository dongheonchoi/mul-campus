<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function(){ //body부분이 dom tree로 메모리에 준비가 되엇을때,
	//입력값으로 넣은 함수를 실행해주세요.
		//alert("월요일 좋아~")
		$('#b2').click(function() {
				
			$.ajax({
				url: "movie",
				data:{
					name: $("#name").val(),
					price: $("#price").val(),
				},
				success: function(x){
					alert('movie요청 성공!')
					alert(x)
					$('#result').append(x + "<br>")
				},
				error: function(){
					alert('movie요청 실패!')
				} //error
			}) //ajax
		}) //b2
		
	})


</script>

</head>
<body>
영화 제목 : <input id = "name"><br>
영화 가격 : <input id = "price"><br>
<input id = "b2" type = "button" value = "영화 예매 항목 확인"><br>
<hr color ="red">
<div id = "result"></div>
</body>
</html>