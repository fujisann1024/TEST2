<%
String name = "アンパンマン";
int age = 23;
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Date,java.text.SimpleDateFormat" %>
<%
	//運勢をランダムで決定
	String[] luckArray = {"超スッキリ","スッキリ","最悪"};
	int index = (int) (Math.random() * 3);
	String luck = luckArray[index];

	//実行日を取得
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
	String today = sdf.format(date);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSPのサンプル</title>
</head>
<body>
<%--コメント --%>
<p>私の名前は<%= name %>。年齢は<%= age %>歳です</p>
<p><%= today %>の運勢は「<%= luck %>」です</p>

<form action = "/WebSample/SampleServket" method="get">
名前:<input type = "text" name = "name">
男:<input type = "radio" name = "gender" value = "0">
女:<input type = "radio" name = "gender" value = "1"><br>
<input type = "submit" value = "送信">

</form>
</body>
</html>