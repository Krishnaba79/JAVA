<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

      <h1>Add Order</h1>
    <form action="addOrder" method="post">
        <label for="customerName">Customer Name:</label>
        <input type="text" id="customerName" name="customerName"><br><br>
        <label for="orderDate">Order Date:</label>
        <input type="date" id="orderDate" name="orderDate"><br><br>
        <input type="submit" value="Add Order">
    </form>
</body>
</html>