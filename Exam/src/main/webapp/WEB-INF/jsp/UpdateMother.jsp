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

<form:form modelAttribute="mother" action="updateMother" >
	
		Mother's ID
		<form:input path="mothers_id" /><br>
		
		Mother Name:
		<form:input path="mother_name" /><br>
		
		Child Name
		<form:input path="child_name" /><br>
		
		Husband Name
		<form:input path="husband_name" /><br>
		
		Mother Age
		<form:input path="mother_age" /><br>
		
		Mother Phone Number:
		<form:input path="mo_phone_no" /><br>
	
		<form:button type="submit" >Submit</form:button>
		
	
	</form:form>

</body>
</html>