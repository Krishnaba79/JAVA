<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2><%out.println("Hello from jsp file"); %></h2>
<br/>
<h2>Request value from form</h2>
<h2><%= request.getParameter("enroll") %></h2>
<%-- <% String e= request.getParameter("enroll"); --%>
<%-- out.print(e);%> --%>
<%-- <% response.sendRedirect("home.html"); %> --%>
<%= application.getInitParameter("dbusername") %>
<%= config.getInitParameter("username") %>

</body>
</html>