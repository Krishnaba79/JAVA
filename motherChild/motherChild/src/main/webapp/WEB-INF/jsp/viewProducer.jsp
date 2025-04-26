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
	<c:forEach var="s" items="${producer}">
	<tr>
		<td>${s.producer_id}</td>
		<td>${s.producer_name}</td>
		<td>${s.company_name }</td>
		<td><a href="updateProducer/${s.producer_id}">Update</a></td>
		<td><a href="deleteProducer/${s.producer_id}">Delete</a></td>
	</tr>
	</c:forEach>
</table>

</body>
</html>