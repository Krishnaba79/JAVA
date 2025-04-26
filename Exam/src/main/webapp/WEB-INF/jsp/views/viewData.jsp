<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>View Data</title>
</head>
<body>
    <h2>Mother Data</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="mother" items="${mothers}">
            <tr>
                <td>${mother.id}</td>
                <td>${mother.name}</td>
                <td>
                    <a href="editMother/${mother.id}">Edit</a>
                    <a href="deleteMother/${mother.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>

    <h2>Child Data</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Mother ID</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="child" items="${children}">
            <tr>
                <td>${child.id}</td>
                <td>${child.name}</td>
                <td>${child.motherId}</td>
                <td>
                    <a href="editChild/${child.id}">Edit</a>
                    <a href="deleteChild/${child.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>