<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
    <!-- 1. 전달된 값 받아주기.(request이용)  -->
    <!-- 2. dao에게  값 전달(DAO이용). -->
    <!-- 3. 전달된 값을 출력하는 결과를 브라우저에 Html로 보내주기 -->
<%
String title = request.getParameter("title");
String content = request.getParameter("content");
String writer = request.getParameter("writer");

//1. 받은 데이터를 dao에게 주기 위해서 가방을 만들어서 넣자
BbsVO bag = new BbsVO();
bag.setTitle(title);
bag.setContent(content);
bag.setWriter(writer);
//2. dao에게 가방을 전달하면서 insert 해달라고 하자.
BbsDAO dao = new BbsDAO();
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
가입한 title : <%=title %><br>
가입한 content : <%=content %><br>
가입한 writer : <%=writer %><br>
</body>
</html>