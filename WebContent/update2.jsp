<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%
	//클라이언트가 입력한 NO를 서버에서 받아주기 (자바로!)
String no = request.getParameter("no");
String content = request.getParameter("content");
//jsp안에 생성된 변수는 ram에 생성 초기화 필요

BbsVO bag = new BbsVO();
bag.setNo(Integer.parseInt(no));
bag.setContent(content);
//2. dao에게 가방을 전달하면서 insert 해달라고 하자.
BbsDAO dao = new BbsDAO();
dao.update(bag);


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신이 변경를 원하는 번호는 <%= no %><br>
당신이 변경를 원하는 내용은 <%= content %>
</body>
</html>