<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form modelAttribute="employee" action="updated">
		Movie_Id:
		<form:input path="id" />
		<br> <br>
		
		Movie_Name:
		<form:input path="name" />
		<br> <br>
		
		Released_Date:
		<form:input path="date" />
		<br> <br>
		
		Description:
		<form:input path="desc" />
		<br> <br>
		<form:button value="submit" type="submit">Submit</form:button>
	</form:form>
	
</body>
</html>