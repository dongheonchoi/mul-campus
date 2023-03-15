<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
    <!-- 1. 전달된 값 받아주기.(request이용)  -->
    <!-- 2. dao에게  값 전달(DAO이용). -->
    <!-- 3. 전달된 값을 출력하는 결과를 브라우저에 Html로 보내주기 -->
<%
String id = request.getParameter("id");
String tel = request.getParameter("tel");

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
body {
	background: lime;
}
</style>
</head>
<body>회원가입 요청되었음.
<hr color = "red">
변경하실 아이디 : <%=id %><br>
변경하실 전화번호 : <%=tel %><br>
</body>
</html>