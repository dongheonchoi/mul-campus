<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
$(function() {
	$('#b1').click(function() {
		$.ajax({
			crossOrigin: true,
			url: "http://api.openweathermap.org/data/2.5/weather?q=suwon&appid=f533c5b4dfcf415738d75292f8e315b7",
			dataType: 'json',
			success: function(x) {
				console.log(x);
				alert(x.coord.lat)
			}			
		})
	})
})


</script>


</head>
<body>
<button id = "b1">수원 날씨 알아오기</button>
</body>
</html>