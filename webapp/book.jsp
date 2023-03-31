<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>책등록 화면입니다. </h3>

<a href ="list3">모든 책 가져오기</a>

<hr color="red">
<form action="book" method="get">
	책 이름 : <input name="name" value="드라마"><br>
	주소 : <input name="url" value="드라마"><br>
	사진 명 : <input name="img" value="드라마"><br>
	<button type="submit">서버로 전송</button>
</form>
<h3>책 검색</h3>
<form action="one" method="get">
	책 ID : <input name="id" value="1"><br>
	<button type="submit">서버로 전송</button>
</form>
</body>
</html>