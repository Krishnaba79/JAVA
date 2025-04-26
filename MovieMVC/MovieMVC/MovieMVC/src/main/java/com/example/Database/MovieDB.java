package com.example.Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import com.example.Model.Movie;

public class MovieDB {
	
	@Autowired
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int insertData(Movie mov)
	{
		String sql = "INSERT INTO movie VALUES('"+ mov.getId()+"','"+mov.getName()+"','"+mov.getDate()+"','"+mov.getDesc()+"')";
		int rows = template.update(sql);
		return rows;
	}
	
	public List<Movie> getAll()
	{
		String sql = "SELECT * FROM movie";
		List<Movie> movList = template.query(sql, new RowMapper<Movie>(){

			@Override
			public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Movie movie = new Movie();
				movie.setId(rs.getInt("movie_id"));
				movie.setName(rs.getString("movie_name"));
				movie.setDate(rs.getString("release_date"));
				movie.setDesc(rs.getString("description"));
				return movie;
			}
			
		});
		return movList;
	}
	
	public Movie getOneMovie(int id) 
	{
		String sql = "SELECT * FROM movie WHERE movie_id=?";
		Movie movie = template.queryForObject(sql, new Object[] {id},new BeanPropertyRowMapper<Movie>(Movie.class));
		
		return movie;
	}
	
	public int updateMovie(Movie movie)
	{
		String sql = "UPDATE movie SET name=? WHERE movie_id=?";
		
		int id = movie.getId();
		int rows = template.update(sql,movie.getName(),id);
		return rows;
	}
	
	public int delMovie(int id)
	{
		String mainSQLQuery = "DELETE FROM movie WHERE movie_id=?";
		int rows = template.update(mainSQLQuery,id);
		return rows;
	}
}





















