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

<form:form modelAttribute="child" action="updateChild" >
		
		Child's ID
		<form:input path="childs_id" /><br>
		
		Child Name :
		<form:input path="child_name" /><br>
		
		Child BirthDate :
		<form:input path="mother_name" /><br>
		
		Father Name :
		<form:input path="father_name" /><br>
		
		Mother Name :
		<form:input path="mother_name" /><br>
		
		Child Age :
		<form:input path="child_age" /><br>
		
		Child Phone Number:
		<form:input path="ch_phone_no" /><br>
	
		<form:button type="submit" >Submit</form:button>
		
	</form:form>

</body>
</html>