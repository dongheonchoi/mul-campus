<%@page import="multi.restaurantDAO"%>
<%@page import="multi.restaurantVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%
	//클라이언트가 입력한 NO를 서버에서 받아주기 (자바로!)
String id = request.getParameter("id");
String price = request.getParameter("price");
//jsp안에 생성된 변수는 ram에 생성 초기화 필요

restaurantVO bag = new restaurantVO();
bag.setId(Integer.parseInt(id));
bag.setPrice(Integer.parseInt(price));
//2. dao에게 가방을 전달하면서 insert 해달라고 하자.
restaurantDAO dao = new restaurantDAO();
dao.update(bag);


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신이 변경를 원하는 id는 <%= id %><br>
당신이 변경를 원하는 가격은 <%= price %>
</body>
</html>