package com.example.controller;

import com.example.dao.MovieDAO;
import com.example.model.Movie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/movies")
public class MovieServlet extends HttpServlet {
    private MovieDAO movieDAO;

    @Override
    public void init() {
        movieDAO = new MovieDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "list";
        }

        try {
            switch (action) {
                case "new":
                    showNewForm(request, response);
                    break;
                case "insert":
                    insertMovie(request, response);
                    break;
                case "delete":
                    deleteMovie(request, response);
                    break;
                case "edit":
                    showEditForm(request, response);
                    break;
                case "update":
                    updateMovie(request, response);
                    break;
                default:
                    listMovies(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void listMovies(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        List<Movie> listMovies = movieDAO.getAllMovies();
        request.setAttribute("listMovies", listMovies);
        request.getRequestDispatcher("/views/viewMovies.jsp").forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/views/addMovie.jsp").forward(request, response);
    }

    private void insertMovie(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        String movieName = request.getParameter("movieName");
        String releaseDate = request.getParameter("releaseDate");
        String description = request.getParameter("description");
        Movie movie = new Movie();
        movie.setMovieName(movieName);
        movie.setReleaseDate(releaseDate);
        movie.setDescription(description);
        movieDAO.addMovie(movie);
        response.sendRedirect("movies?action=list");
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int movieId = Integer.parseInt(request.getParameter("movieId"));
        Movie existingMovie = movieDAO.getAllMovies().stream().filter(m -> m.getMovieId() == movieId).findFirst().orElse(null);
        request.setAttribute("movie", existingMovie);
        request.getRequestDispatcher("/views/addMovie.jsp").forward(request, response);
    }

    private void updateMovie(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int movieId = Integer.parseInt(request.getParameter("movieId"));
        String movieName = request.getParameter("movieName");
        String releaseDate = request.getParameter("releaseDate");
        String description = request.getParameter("description");

        Movie movie = new Movie();
        movie.setMovieId(movieId);
        movie.setMovieName(movieName);
        movie.setReleaseDate(releaseDate);
        movie.setDescription(description);

        movieDAO.updateMovie(movie);
        response.sendRedirect("movies?action=list");
    }

    private void deleteMovie(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int movieId = Integer.parseInt(request.getParameter("movieId"));
        movieDAO.deleteMovie(movieId);
        response.sendRedirect("movies?action=list");
    }
}
