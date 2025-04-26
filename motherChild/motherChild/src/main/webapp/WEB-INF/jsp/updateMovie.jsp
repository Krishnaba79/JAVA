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
	<form:form modelAttribute="movie" action="updateMovie">
		Movie ID
		<form:input path="movie_id"/> <br>
		Movie Name
		<form:input path="movie_name"/> <br>
		Movie Released Date
		<form:input path="release_date"/> <br>
		Movie Description
		<form:input path="description"/> <br>
		<form:button>Submit</form:button>
	</form:form>
</body>
</html>