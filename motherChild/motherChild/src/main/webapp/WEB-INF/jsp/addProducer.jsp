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

	<form:form modelAttribute="producer" action="insertProducer">
		Child ID
		<form:input path="producer_id"/> <br>
		Child Name
		<form:input path="producer_name"/> <br>
		Mother_name
		<form:input path="company_name"/> <br>
		<form:button>Submit</form:button>
	</form:form>

</body>
</html>