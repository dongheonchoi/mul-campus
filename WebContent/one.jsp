<%@page import="multi.MemberVO"%>
<%@page import="multi.MemberDAO3"%>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%
	//클라이언트가 입력한 NO를 서버에서 받아주기 (자바로!)
String id = request.getParameter("id");
//jsp안에 생성된 변수는 ram에 생성 초기화 필요

MemberDAO3 dao = new MemberDAO3();
MemberVO bag2 =  dao.one(id);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신이 검색을 원하는 id는 <%= bag2.getId() %><hr color = "red">
검색한 pw: <%= bag2.getPw() %><br>
검색한 name: <%= bag2.getName() %><br>
검색한 tel: <%= bag2.getTel() %>
</body>
</html>