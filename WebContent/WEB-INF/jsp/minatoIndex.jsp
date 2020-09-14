<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "model2.SiteEV" %>
<%
SiteEV siteEV = (SiteEV) application.getAttribute("siteEV");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>アンパンマンのページ</title>
</head>
<body>
<h1>アンパンマンのページへようこそ</h1>
<p>
	<a href = "/WebSample/MinatoIndex?action=like">よいね</a>
	<%= siteEV.getLike() %>人
	<a href = "/WebSample/MinatoIndex?action=dislike">よくないね</a>
	<%= siteEV.getDislike() %>人
</p>
<h2>アンパンマンとは</h2>
</body>
</html>