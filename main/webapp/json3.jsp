<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//스크릿트릿

	JSONObject json = new JSONObject();
	json.put("today", "rain"); //{name : hong}
	json.put("temp", 15); 
	json.put("hu", 98); 
	
	//out.print(json.toJSONString());

	
//	out.print(json.toJSONString());
	
%><%= json.toJSONString() %>