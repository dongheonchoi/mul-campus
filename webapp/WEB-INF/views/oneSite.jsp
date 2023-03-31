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
<a href=“site.jsp”>메인으로 돌아가기</a><br>

${bag.no}>
${bag.name}<br>
${bag.url}<br>
${bag.img}<br>

<hr color="red">
<h3>사이트 url 변경</h3>
<form action="updateSite" method="get">
	no : <input name="no" value="1"><br>
	url : <input name="url" value="http://www.naver.com"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<h3>사이트 삭제</h3>
<hr color="red">
<form action="deleteSite" method="get">
	no : <input name="no" value="1"><br>
	<button type="submit">사이트 삭제</button>
</form>
<hr color="red">


</body>
</html>