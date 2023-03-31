<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: yellow;
}
td{
	width: 100px;
	text-align: center;
}
.top{
	background: black;
	color: white;
}
.down{
	background: lime;
}
</style>
</head>
<body>
<!--  표현식(expression) --> 
전체 사이트입니다.<br>
<a href=“site.jsp”>메인으로 돌아가기</a><br>
<!-- bag.getId()  -->
<%--model의 속성으로 전달받은 bag은 EL로 출력한다. --%>
<!-- EL: 속성으로 지정한 값 꺼내서 출력해주세요.!라는 의미! -->
<!-- 	for (String s : list) {
			
		}
 -->
<table>
<tr>
	<td class="top">no</td>
	<td class="top">name</td>
	<td class="top">url</td>
	<td class="top">img</td>
</tr>
<c:forEach items="${list}" var="bag" begin="0" end="10" step="1">
<tr>
	<td class="down">${bag.no}</td>
	<td class="down">
		<a href="oneSite?no=${bag.no}">${bag.name}</a>
	</td>
	<td class="down">${bag.url}</td>
	<td class="down"><img src="resources/img/${bag.img}"></td>
</tr> 
</c:forEach>
</table>
</body>
</html>