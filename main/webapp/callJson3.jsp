<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- content delivery network  : CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript">
   $(function() {
	   $('#b1').click(function() {
	         $.ajax({
	            url: "one22",
	          data : {
	             no: 1
	          },
	            dataType : "json",
	            success: function(json) {
	               no = json.no
	               content = json.content
	               $('#result').append(no + " " + content + "<br>")
	            } //success
	         }) //ajax
	       })//b1
      $('#b11').click(function() {
         $.ajax({
            url: "json1",
            dataType : "json",
            success: function(json) {
               id = json.id
               pw = json.pw
               name = json.name
               tel = json.tel //json에서 tel키로 값을 추출
               table = "<table><tr><td>항목명</td><td>값</td></tr>" + 
               "<tr><td>아이디</td><td>" + id +"</td></tr>" + 
               "<tr><td>패스워드</td><td>" + pw +"</td></tr>" + 
               "<tr><td>이름</td><td>" + name +"</td></tr>" + 
               "<tr><td>전화번호</td><td>" + tel +"</td></tr></table>"
               $('#result').append(table)
            } //success
         }) //ajax
      })//b11
      $('#b111').click(function() {
         $.ajax({
            url: "json1",
            dataType : "json",
            success: function(json) {
               id = json.id
               pw = json.pw
               name = json.name
               tel = json.tel //json에서 tel키로 값을 추출
               table = "<ul><li>" +id+"</li>"+ 
               "<li>" +pw+"</li>"+
               "<li>" +name+"</li>"+
               "<li>" +tel+"</li></ul>"
               
               $('#result').append(table)
            } //success
         }) //ajax
      })//b111
      $('#b2').click(function() {
         $.ajax({
            url: "json2",
            dataType : "json",
            success: function(json) {//[{}, {id: "", name: "", pw : "", tel: ""}]
               id1 = json[1].id
               name1 = json[1].name
               $('#result').append("json배열 중 2번째 것>> " + name1 + " " + id1 + "<br>")
               
            } //success
         }) //ajax
      })//b2

      $('#b3').click(function() {
         $.ajax({
            url: "json3",
            dataType : "json",
            success: function(json) {
               no = json.no
               content = json.content
               $('#result').append(no + " " + content + "<br>")
            } //success
         }) //ajax
      })//b3
            $('#b4').click(function() {
               $.ajax({
                  url: "json4",
                  dataType : "json",
                  success: function(json) {
                     no = json[0].no
                     content = json[0].content
                     $('#result').append(no + " " + content + "<br>")
                  } //success
               }) //ajax
            })//b4
   })//$
</script>

</head>
<body>
<button id="b1">컨트롤러에서 bbs JSON(text)을 받아오자.!</button>
<button id="b11">컨트롤러에서 bbs JSON(table)을 받아오자.!</button>
<button id="b2">컨트롤러에서 bbs JSONArray를 받아오자.!</button>
<button id="b3">컨트롤러에서 JSON3을 받아오자.!</button>
<button id="b4">컨트롤러에서 JSONArray4를 받아오자.!</button>
<hr color="red">
<div id="result"></div>
</body>
</html>