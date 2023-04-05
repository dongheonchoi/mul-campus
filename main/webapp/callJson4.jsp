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
            url: "jsonResponse3",
            data :{
            	id: "spring"
            },
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
      $('#b2').click(function() {
    	 $('#result').empty()
         $.ajax({
            url: "jsonResponse4",
            dataType : "json",
            success: function(json) {
                for (var i = 0; i < json.length; i++) {

                    list = "<ul><li>" + "상세정보" +"</li>"+ 
                    "<li>" +json[i].id+"</li>"+
                    "<li>" +json[i].pw+"</li>"+
                    "<li>" +json[i].name+"</li>"+
                    "<li>" +json[i].tel+"</li></ul>"
                    table = "<table><tr><td>상세정보</td><td>값</td></tr>" + 
                    "<tr><td>아이디</td><td>" + json[i].id +"</td></tr>" + 
                    "<tr><td>패스워드</td><td>" + json[i].pw +"</td></tr>" + 
                    "<tr><td>이름</td><td>" + json[i].name +"</td></tr>" + 
                    "<tr><td>전화번호</td><td>" + json[i].tel +"</td></tr></table>"
                    
                    $('#result').append(list)
                    $('#result').append(table)
 				}
       
             } //success
         }) //ajax
      })//b111
      $('#b3').click(function() {
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

      $('#b4').click(function() {
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
           
   })//$
</script>

</head>
<body>
<button id="b1">컨트롤러에서 member JSON(table)을 받아오자.!</button>
<button id="b2">컨트롤러에서 memberList JSON을 받아오자.!</button>
<button id="b3">컨트롤러에서 bbs JSONArray를 받아오자.!</button>
<button id="b4">컨트롤러에서 JSON3을 받아오자.!</button>
<hr color="red">
<div id="result"></div>
</body>
</html>