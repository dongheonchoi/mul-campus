<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원 검색이 요청됨
<!-- 송성으로 지정한 값은 EL로 프린트 -->
<hr color = "red">
${vo}<br>
${vo.id}<br>
${vo.pw}<br>
${vo.name}<br>
${vo.tel}
</body>
</html>