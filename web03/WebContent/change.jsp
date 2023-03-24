<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String m = request.getParameter("money");
	int money2 = Integer.parseInt(m);
	
	Double change = (money2)*0.00078;
		

%><%=change%>