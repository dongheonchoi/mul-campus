<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie[] cookies = request.getCookies();
%>
<hr color = "red">
쿠키의 개수는 : <%=cookies.length %>
<hr color ="red">
<%
	for(Cookie c: cookies){
		if(!c.getName().equals("JSESSIONID")){
			out.println(c.getName() + ": " + c.getValue() + "<br>");
		}
	}

%>
</body>
</html>