<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
	<c:forEach var="s" items="${movie}">
	<tr>
		<td>${s.movie_id}</td>
		<td>${s.movie_name}</td>
		<td>${s.release_date }</td>
		<td>${s.description}</td>
		<td><a href="updateMovie/${s.movie_id}">Update</a></td>
		<td><a href="deleteMovie/${s.movie_id}">Delete</a></td>
	</tr>
	</c:forEach>
</table>

</body>
</html>