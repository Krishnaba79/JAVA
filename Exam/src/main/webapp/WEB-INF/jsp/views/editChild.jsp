<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Child</title>
</head>
<body>
    <h2>Edit Child</h2>
    <form action="updateChild" method="post">
        <input type="hidden" name="id" value="${child.id}"/>
        Name: <input type="text" name="name" value="${child.name}"/><br/>
        Mother:
        <select name="motherId">
            <c:forEach var="mother" items="${mothers}">
                <option value="${mother.id}" <c:if test="${mother.id == child.motherId}">selected</c:if>>${mother.name}</option>
            </c:forEach>
        </select><br/>
        <input type="submit" value="Update"/>
    </form>
</body>
</html>
    