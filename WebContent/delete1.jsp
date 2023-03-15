<%@page import="multi.MemberDAO3"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%
	//클라이언트가 입력한 NO를 서버에서 받아주기 (자바로!)
String id = request.getParameter("id");
//jsp안에 생성된 변수는 ram에 생성 초기화 필요


MemberDAO3 dao = new MemberDAO3();
dao.delete(id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신이 삭제를 원하는 아이디는 <%= id %>
</body>
</html>