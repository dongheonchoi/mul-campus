<%@page import="multi.restaurantDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%
	//클라이언트가 입력한 NO를 서버에서 받아주기 (자바로!)
String id = request.getParameter("id");
//jsp안에 생성된 변수는 ram에 생성 초기화 필요

restaurantDAO dao = new restaurantDAO();
dao.delete(Integer.parseInt(id));

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신이 삭제하신 음식점 ID는 <%= id %>
</body>
</html>