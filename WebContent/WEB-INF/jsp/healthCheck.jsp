<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ健康診断</title>
</head>
<body>
<h1>スッキリ健康診断</h1>
<form action = "/WebSample/HealthCheck" method = "post" >
height:<input type = "text" name = "height">
weight:<input type = "text" name = "weight">
<input type = "submit" value = "judgment">
</form>
</body>
</html>