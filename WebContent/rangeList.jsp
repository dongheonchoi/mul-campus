<%@page import="multi.MovieDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 1. 전달된 값 받아주기.(request이용)  -->
<!-- 2. dao에게  값 전달(DAO이용). -->
<!-- 3. 전달된 값을 출력하는 결과를 브라우저에 Html로 보내주기 -->
<jsp:useBean id="bag" class="multi.MovieVO"></jsp:useBean>
<jsp:setProperty property="*" name="bag" />
<%
	/* String id = request.getParameter("id");
String name = request.getParameter("name");
String content = request.getParameter("content");
String price = request.getParameter("price");
String company = request.getParameter("company");
String img = request.getParameter("img");

//1. 받은 데이터를 dao에게 주기 위해서 가방을 만들어서 넣자
ProductVO bag = new ProductVO();
bag.setId(id);
bag.setName(name);
bag.setContent(content);
bag.setPrice(Integer.parseInt(price));
bag.setCompany(company);
bag.setImg(img); */
//2. dao에게 가방을 전달하면서 insert 해달라고 하자.
MovieDAO dao = new MovieDAO();
dao.insert(bag);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: lime;
}
</style>
</head>
<body>
	영화정보를 입력하였습니다.
	<hr color="red">
	<!-- img src = img/shoes1.jpg  -->
</body>
</html>