<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Producer</title>
</head>
<body>
    <h2>Add Producer</h2>
    <form action="producers?action=insert" method="post">
        <input type="hidden" name="producerId" value="${producer.producerId}">
        <label for="name">Name:</label>
        <input type="text" name="name" id="name" value="${producer.name}" required><br>
        <label for="companyName">Company Name:</label>
        <input type="text" name="companyName" id="companyName" value="${producer.companyName}" required><br>
        <input type="submit" value="Save">
    </form>
</body>
</html>
