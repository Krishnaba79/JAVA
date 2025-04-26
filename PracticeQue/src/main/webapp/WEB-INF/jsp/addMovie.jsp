<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Movie</title>
</head>
<body>
    <h2>Add Movie</h2>
    <form action="movies?action=insert" method="post">
        <input type="hidden" name="movieId" value="${movie.movieId}">
        <label for="movieName">Name:</label>
        <input type="text" name="movieName" id="movieName" value="${movie.movieName}" required><br>
        <label for="releaseDate">Release Date:</label>
        <input type="text" name="releaseDate" id="releaseDate" value="${movie.releaseDate}" required><br>
        <label for="description">Description:</label>
        <textarea name="description" id="description" required>${movie.description}</textarea><br>
        <input type="submit" value="Save">
    </form>
</body>
</html>
