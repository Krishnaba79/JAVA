<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Movies</title>
</head>
<body>
    <h2>Movies</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Release Date</th>
            <th>Description</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="movie" items="${listMovies}">
            <tr>
                <td>${movie.movieId}</td>
                <td>${movie.movieName}</td>
                <td>${movie.releaseDate}</td>
                <td>${movie.description}</td>
                <td>
                    <a href="movies?action=edit&movieId=${movie.movieId}">Edit</a>
                    <a href="movies?action=delete&movieId=${movie.movieId}" onclick="return confirm('Are you sure?')">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
