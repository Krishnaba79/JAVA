<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	  <h1>Show Data</h1>
    <table border="1">
        <tr>
            <th>Customer Name</th>
            <th>Email</th>
            <th>Order Date</th>
            <th>Actions</th>
        </tr>
        <!-- iterate over the data and display it -->
        <c:forEach items="${data}" var="item">
            <tr>
                <td>${item.customerName}</td>
                <td>${item.email}</td>
                <td>${item.orderDate}</td>
                <td>
                    <a href="updateData?id=${item.id}">Update</a>
                    <a href="deleteData?id=${item.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>