<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Add Student Form</p>
<f:form action="addData" modelAttribute="student">
	Roll No:
	<br>
	<f:input path="rollno" />
	<br>
	Name:
	<br>
	<f:input path="name" />
	<br>
	Email:
	<br>
	<f:input path="email" />
	<br>
	Semester:
	<br>
	<f:input path="sem" /><br><br>
	<f:button name="submit" type="submit"></f:button>

</f:form>

</body>
</html>