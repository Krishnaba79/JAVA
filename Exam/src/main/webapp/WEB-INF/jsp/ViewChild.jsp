<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1">
		<c:forEach var="s" items="${child}">
		<tr>
			<td>Child's ID</td>
			<td>Child Name</td>
			<td>Child BirtDate</td>
			<td>Father Name</td>
			<td>Mother Name</td>
			<td>Child Age</td>
			<td>Child Phone Number</td>
			<td>Update</td>
			<td>Delete</td>
		</tr>
		<tr>
			<td>${s.childs_id}</td>
			<td>${s.child_name}</td>
			<td>${s.child_birtdate}</td>
			<td>${s.father_name}</td>
			<td>${s.mother_name}</td>
			<td>${s.child_age}</td>
			<td>${s.ch_phone_no}</td>
			<td><a href="updateMovie/${s.mothers_id}">Update</a></td>
			<td><a href="deleteMovie/${s.mothers_id}">Delete</a></td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>