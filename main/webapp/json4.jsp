<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//스크릿트릿

	JSONObject json = new JSONObject();
	json.put("high", 2482.01); //{name : hong}
	json.put("low", 2478.49); 
	json.put("end", 2480.51); 
	
	JSONObject json2 = new JSONObject();
	json2.put("high", 2482.61); //{name : hong}
	json2.put("low", 2478.94); 
	json2.put("end", 2484.32);
	
	JSONArray array = new JSONArray();
	array.add(json);
	array.add(json2);
	
//	out.print(json.toJSONString());
	
%><%= array.toJSONString() %>