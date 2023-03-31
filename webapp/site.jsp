<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href = "listSite">전체 사이트 불러오기</a>

	<form action="insertSite" method="get">
	
	사이트 명 : <input name="name" value="네이버"><br>
	사이트 주소 : <input name="url" value="http://WWW.naver.com	"><br>
	사이트 이미지 : <input name="img" value="naver.jpg"><br>
	<button type="submit">사이트 추가</button>
	</form>

</body>
</html>