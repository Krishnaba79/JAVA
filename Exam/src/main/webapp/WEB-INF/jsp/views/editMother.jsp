<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Mother</title>
</head>
<body>
    <h2>Edit Mother</h2>
    <form action="updateMother" method="post">
        <input type="hidden" name="id" value="${mother.id}"/>
        Name: <input type="text" name="name" value="${mother.name}"/><br/>
        <input type="submit" value="Update"/>
    </form>
</body>
</html>
    