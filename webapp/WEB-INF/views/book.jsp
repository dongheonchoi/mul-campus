<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style >
body{
	background: yellow
}
</style>
</head>
<body>
책 등록이 완료 되었습니다.<br>
책이름${bag.name}<br>
책 주소${bag.url}<br>
검색한 이미지 >> <img src="resources/img/${bag.img}" width="250" height="200">

</body>
</html>