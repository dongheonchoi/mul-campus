<%@page import="multi.restaurantDAO"%>
<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
    <!-- 1. 전달된 값 받아주기.(request이용)  -->
    <!-- 2. dao에게  값 전달(DAO이용). -->
    <!-- 3. 전달된 값을 출력하는 결과를 브라우저에 Html로 보내주기 -->
<jsp:useBean id="bag" class="multi.restaurantVO"></jsp:useBean>
<jsp:setProperty property="*" name="bag" />
<%
restaurantDAO dao = new restaurantDAO();
dao.insert(bag);
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
등록한 음식점 : <%=bag.getName() %><br>
등록한 대표메뉴 : <%=bag.getMenu() %><br>
등록한 가격 : <%= bag.getPrice() %><br> 
등록한 이미지 : <img src="img/<%=bag.getImg()%>" width=200 height=200><br>
</body>
</html>