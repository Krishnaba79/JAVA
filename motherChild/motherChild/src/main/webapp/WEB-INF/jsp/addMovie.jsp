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
	
	<form:form modelAttribute="movie" action="insertMovie" >
	
		Mother ID
		<form:input path="movie_id" /><br>
		
		Mother Name
		<form:input path="movie_name" /><br>
		
		Mother Birth Date
		<form:input path="release_date" /><br>
		
		Child Name
		<form:input path="description" /><br>
	
		<form:button type="submit" >Submit</form:button>
	
	</form:form>
	
	
</body>
</html>