<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
전체 조회수 :<%=session.getAttribute("view") %>
<%
if(session.getAttribute("view").equals(0)){
	out.print("아무도 방문하지않았습니다." + "<br>");
}else{
	out.print(session.getAttribute("view"));
}

%>



</body>
</html>