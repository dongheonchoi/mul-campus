<%@page import="multi.restaurantDAO"%>
<%@page import="multi.restaurantVO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id"); 
    	
   		restaurantDAO dao = new restaurantDAO();
    	restaurantVO bag2 = dao.one(Integer.parseInt(id));
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
당신이 검색을 원하는 아이디는 <%= id %>
<hr color="red">
 <table class="table table-danger table-striped">
 	<tr>
 		<td>음식점 id</td>
 		<td><%= bag2.getId() %></td>
 	</tr>
 	<tr>
 		<td>음식점이름</td>
 		<td><%= bag2.getName() %></td>
 	</tr>
 	<tr>
 		<td>대표 메뉴</td>
 		<td><%= bag2.getMenu() %></td>
 	</tr>
 	<tr>
 		<td>가격</td>
 		<td><%= bag2.getPrice() %></td>
 	</tr>
 	<tr>
 		<td>음식 사진</td>
 		<td><img src="img/<%=bag2.getImg()%> " width=200 height=200></td>
 	</tr>
 </table>
</body>
</html>