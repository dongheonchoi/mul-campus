<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
	//MVC방법론 버전 1 ==> mvc1(jsp로만 만들었을 때)
	//MVC방법론 버전 2 ==> mvc2(spring으로 만든다.)
	//1. 브라우저에서 넘어오는 값 받기
	//넘어오는 값 제어해주는 코드(자바코드)
	//Controller(자바코드)
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	//2. dao에 데이터 값을 주면서 insert 요청하세요.
	//DAO(JDBC4단계에 의해 코딩이 됨. 항상 방법이 똑같다.)
	//Model(자바코드)
	
	//3. 결과를 html에 담아서 클라이언트로 전송해주세요.
	//보여주는 부분(html)
	//view(html)
	
	%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
가입 id: <%= id%><br>
가입 pw: <%= pw%><br>
가입 name: <%= name%><br>
가입 tel: <%= tel%><br>
</body>
</html>