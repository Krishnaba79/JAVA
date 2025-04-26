<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form:form modelAttribute="order" action="updateOrder">
		Order ID
		<form:input path="Order_id"/> <br>
		 Customer Name
		<form:input path="Customer_name"/> <br>
		Order Date
		<form:input path="Order_date"/> <br>
		 
		<form:button>Submit</form:button>
	</form:form>

</body>
</html>