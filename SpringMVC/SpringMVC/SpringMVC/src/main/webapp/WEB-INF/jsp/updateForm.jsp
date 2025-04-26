	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form modelAttribute="employee" action="updated">
		Id:
		<form:input path="id" />
		<br> <br>
		
		Name:
		<form:input path="name" />
		<br> <br>
		<form:button value="submit" type="submit">Submit</form:button>
	</form:form>


</body>
</html>