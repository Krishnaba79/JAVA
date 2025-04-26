<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Producers</title>
</head>
<body>
    <h2>Producers</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Company Name</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="producer" items="${listProducers}">
            <tr>
                <td>${producer.producerId}</td>
                <td>${producer.name}</td>
                <td>${producer.companyName}</td>
                <td>
                    <a href="producers?action=edit&producerId=${producer.producerId}">Edit</a>
                    <a href="producers?action=delete&producerId=${producer.producerId}" onclick="return confirm('Are you sure?')">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
