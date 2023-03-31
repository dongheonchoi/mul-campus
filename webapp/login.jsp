<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% if(session.getAttribute("id") == null){%>
<h3>로그인 화면입니다. </h3>
<hr color="red">
<form action="login" method="get">
	id : <input name="id" value="apple1"><br>
	pw : <input name="pw" value="apple1"><br>
	<button type="submit">서버로 전송</button>
</form>
<%} else{%>
<hr color="red">
${id}님이 로그인 중입니다.
<a href="bbs.jsp">
	<button style = "background: yellow;">게시판 화면으로 go</button>
</a>
<a href="news.jsp">
	<button style = "background: yellow;">news 화면으로 go</button>
</a>
<a href="cafe.jsp">
	<button style = "background: yellow;">cafe 화면으로 go</button>
</a>
<%} %>
</body>
</html>