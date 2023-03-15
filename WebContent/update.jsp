<%@page import="multi.MemberDAO3"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id"); //"apple"
String tel = request.getParameter("tel"); //"010"

MemberVO bag = new MemberVO();
bag.setId(id);
bag.setTel(tel);


MemberDAO3 dao = new MemberDAO3();
dao.update(bag);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신이 변경를 원하는 아이디는 <%= id %><br>
당신이 변경를 원하는 내용은 <%= tel %>
</body>
</html>