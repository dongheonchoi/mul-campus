<%@page import="multi.restaurantVO"%>
<%@page import="multi.restaurantDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	restaurantDAO dao = new restaurantDAO();
ArrayList<restaurantVO> list = dao.list();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<table class="table table-danger table-striped">
		<tr>
			<td>id</td>
			<td>name</td>
			<td>menu</td>
			<td>price</td>
		</tr>
		<%
			for (restaurantVO bag2 : list) {
		%>
		<tr>
			<td><%=bag2.getId()%></td>
			<td>
				<a href="resOne.jsp?id=<%=bag2.getId()%>">
					<%=bag2.getName()%>
				</a>
			</td>
			<td><%=bag2.getMenu()%></td>
			<td><%=bag2.getPrice()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>