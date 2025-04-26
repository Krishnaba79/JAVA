<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="data" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2" >
<tr>
	<th>Roll No</th>
	<th>Name</th>
	<th>Email</th>
	<th>Semester</th>
</tr>
<data:forEach var="s" items="${studentList }">
	<tr>
	
		<td>${s.rollno }</td>
		<td>${s.name }</td>
		<td>${s.email }</td>
		<td>${s.sem }</td>
		<td><a href="update/${s.rollno}">Update</a></td>
		<td><a href="delete/${s.rollno}">Delete</a></td>
		
	</tr>
</data:forEach>

</table>
</body>
</html>