<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="customer" action="DeleteCustomer">
		Customer_id
		<form:input path="Customer_id"/> <br>
		Customer Name
		<form:input path="Customer_name"/> <br>
		Email
		<form:input path="Email"/> <br>
		
		<form:button>Submit</form:button>
	</form:form>
</body>
</html>