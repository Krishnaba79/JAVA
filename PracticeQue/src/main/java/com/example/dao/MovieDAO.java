package com.example.dao;

import com.example.model.Movie;
import com.example.util.DatabaseUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieDAO {
    public void addMovie(Movie movie) throws SQLException {
        String query = "INSERT INTO movies (movie_name, release_date, description) VALUES (?, ?, ?)";
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, movie.getMovieName());
            preparedStatement.setString(2, movie.getReleaseDate());
            preparedStatement.setString(3, movie.getDescription());
            preparedStatement.executeUpdate();
        }
    }

    public List<Movie> getAllMovies() throws SQLException {
        List<Movie> movies = new ArrayList<>();
        String query = "SELECT * FROM movies";
        try (Connection connection = DatabaseUtil.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                Movie movie = new Movie();
                movie.setMovieId(resultSet.getInt("movie_id"));
                movie.setMovieName(resultSet.getString("movie_name"));
                movie.setReleaseDate(resultSet.getString("release_date"));
                movie.setDescription(resultSet.getString("description"));
                movies.add(movie);
            }
        }
        return movies;
    }

    public void updateMovie(Movie movie) throws SQLException {
        String query = "UPDATE movies SET movie_name = ?, release_date = ?, description = ? WHERE movie_id = ?";
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, movie.getMovieName());
            preparedStatement.setString(2, movie.getReleaseDate());
            preparedStatement.setString(3, movie.getDescription());
            preparedStatement.setInt(4, movie.getMovieId());
            preparedStatement.executeUpdate();
        }
    }

    public void deleteMovie(int movieId) throws SQLException {
        String query = "DELETE FROM movies WHERE movie_id = ?";
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, movieId);
            preparedStatement.executeUpdate();
        }
    }
}
