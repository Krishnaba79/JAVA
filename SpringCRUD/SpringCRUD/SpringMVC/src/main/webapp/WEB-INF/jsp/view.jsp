<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="data" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<data:forEach var="s" items="${list}">
	<tr>
		<td><p>${s.id}</p></td>
		<td><p>${s.name}</p></td>
		<td><a href="update/${s.id}">Update</a></td>
		<td><a href="del/${s.id}">Delete</a></td>
	</tr>
	</data:forEach>
</table>
</body>
</html>