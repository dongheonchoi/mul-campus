<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
현재 게시물 조회수 ${"count"}
<h3>게시판 화면입니다. </h3>

<a href ="list2">모든 게시판 리스트 가지고 오기</a><hr>

<% if (session.getAttribute("id") != null) {%>
<h3>게시판 등록화면입니다.</h3>
<hr color="red">
<form action="insert2.multi" method="get">
	no : <input name="no" value="1"><br>
	title : <input name="title" value="1234"><br>
	content : <input name="content" value="park"><br>
	writer : <input name="writer" value="${id}"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<h3>게시판수정 화면입니다. </h3>
<hr color="red">
<form action="update2.multi" method="get">
	no : <input name="no" value="01"><br>
	content : <input name="content" value="011"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>게시판삭제 화면입니다. </h3>
<hr color="red">
<form action="delete2.multi" method="get">
	no : <input name="no" value="01"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<%}else{ %>

<a href="login.jsp">
	<button style = "background: yellow;">로그인 화면으로 go</button>
</a>


<%} %>
<h3>게시판검색 화면입니다. </h3>
<hr color="red">
<form action="one2.multi" method="get">
	no : <input name="no" value="1"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<button type="button">먹통버튼(아무 기능이 없음)</button>
</body>
</html>