<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Add Child</title>
</head>
<body>
    <h2>Add Child</h2>
    <form action="saveChild" method="post">
        Name: <input type="text" name="name"/><br/>
        Mother:
        <select name="motherId">
            <c:forEach var="mother" items="${mothers}">
                <option value="${mother.id}">${mother.name}</option>
            </c:forEach>
        </select><br/>
        <input type="submit" value="Save"/>
    </form>
</body>
</html>
    