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
	<forEach var="s" items="${list}">
	<tr>
		<td>MOVIE_ID</td>
		<td>MOVIE_NAME</td>
		<td>RELEASED_DATE</td>
		<td>DESCRIPTION</td>
		<td>UPDATE</td>
		<td>DELETE</td>
	</tr>
	<tr>
		<td><p>${s.movie_id}</p></td>
		<td><p>${s.movie_name}</p></td>
		<td><p>${s.release_date}</p></td>
		<td><p>${s.description}</p></td>
		<td><a href="update/${s.id}">Update</a></td>
		<td><a href="del/${s.id}">Delete</a></td>
	</tr>
	</forEach>
</table>

</body>
</html>