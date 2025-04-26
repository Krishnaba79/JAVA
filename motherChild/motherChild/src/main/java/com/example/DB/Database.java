package com.example.DB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.example.Model.Movie;
import com.example.Model.Producer;

public class Database {
	
	@Autowired
	JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
		
	}
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int insertMovie(Movie movie) {
		String sql = "INSERT INTO motherData VALUES(?,?,?,?)";
		int rows = template.update(sql,movie.getMovie_id(),movie.getMovie_name(),movie.getRelease_date(),movie.getDescription());
		return rows;
	}
	
	public int insertProducer(Producer producer) {
		String sql = "INSERT INTO childData VALUES(?,?,?)";
		int rows = template.update(sql,producer.getProducer_id(),producer.getProducer_name(),producer.getCompany_name());
		return rows;
	}
	
	
	public List<Movie> viewMovies() {
		String sql = "SELECT * FROM motherData";
		List<Movie> movies = template.query(sql, new RowMapper<Movie>() {

			@Override
			public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
				Movie movie = new Movie();
				movie.setMovie_id(rs.getInt("movie_id"));
				movie.setMovie_name(rs.getString("movie_name"));
				movie.setRelease_date(rs.getString("release_date"));
				movie.setDescription(rs.getString("description"));
				// TODO Auto-generated method stub
				return movie;
			}
			
		});
		return movies;
	}
	
	
	public List<Producer> viewProducers() {
		String sql = "SELECT * FROM childData";
		List<Producer> producerList = template.query(sql, new RowMapper<Producer>() {

			@Override
			public Producer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Producer producer = new Producer();
				producer.setProducer_id(rs.getInt("producer_id"));
				producer.setProducer_name(rs.getString("producer_name"));
				producer.setCompany_name(rs.getString("company_name"));
				return producer;
			}
			
		});
		return producerList;
	}
	
	
	
	
	public Movie getOne(int id) {
		String sql = "SELECT movie_id,movie_name,release_date,description FROM motherData WHERE movie_id=?";
		Movie movie = template.queryForObject(sql, new Object[] {id},new BeanPropertyRowMapper<Movie>(Movie.class));
		return movie;
	}
	
	
	
	public Producer getOneProducer(int id) {
		String sql = "SELECT producer_id,producer_name,company_name FROM childData WHERE producer_id=?";
		Producer producer = template.queryForObject(sql, new Object[] {id},new BeanPropertyRowMapper<Producer>(Producer.class));
		return producer;
	}
	
	public int updateMovie(Movie movie) {
		String sql = "UPDATE motherData SET movie_id=?,movie_name=?,release_date=?,description=? WHERE movie_id=?";
		int rows = template.update(sql,movie.getMovie_id(),movie.getMovie_name(),movie.getRelease_date(),movie.getDescription(),movie.getMovie_id());
		return rows;
	}
	
	public int updateProducer(Producer producer) {
		String sql = "UPDATE childData SET producer_id=?,producer_name=?,company_name=? WHERE producer_id=?";
		int rows = template.update(sql,producer.getProducer_id(),producer.getProducer_name(),producer.getCompany_name(),producer.getProducer_id());
		return rows;
	}
	
	public int deleteMovie(int id) {
		String sql = "DELETE FROM motherData WHERE movie_id=?";
		int rows = template.update(sql,id);
		return rows;
	}
	
	public int deleteProducer(int id) {
		String sql = "DELETE FROM childData WHERE producer_id=?";
		int rows = template.update(sql,id);
		return rows;
	}

}
