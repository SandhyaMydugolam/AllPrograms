
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="search" method="get">
	 <input type="submit" value="choice"><br>
	<a href="admin" target="_blank">Admin</a>
	<input type="submit" value="submit">
	</form>
	${doctors}
	<h2>${message}</h2>
</body>
</html>