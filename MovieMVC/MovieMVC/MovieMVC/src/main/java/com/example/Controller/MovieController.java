package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Database.MovieDB;
import com.example.Model.Movie;

@Controller
public class MovieController {

	@Autowired
	MovieDB db;

	public Movie movieDB;
	
	@RequestMapping("/add")
	public String addMovieForm(@ModelAttribute("movie")Movie movie) {
		return "addMovie";
	}
	
	@RequestMapping("/insert")
	public String addedMovies(@ModelAttribute("movie")Movie movie) {
		
		int rows = db.insertData(movie);
		if(rows>0) {
			return "redirect:/View";
		}else {
			return "";
		}
		
	}
	
	@RequestMapping("/view")
	public String viewMovies(Model model) {
		List<Movie> movie = db.getAll();
		model.addAttribute("movie", movie);
		return "View";
	}
	
	@RequestMapping("/update/{id}")
	public String updateMovieForm(@PathVariable("id")int id,Model model) {
		Movie movie = db.getOneMovie(id);
		model.addAttribute("movie", movie);
		return "updateMovie";
	}
	
	@RequestMapping("del/{id}")
	public String deleteUser(@PathVariable("id")int id)
	{
		int rows = db.delMovie(id);
		if(rows>0)
		{
			return "redirect:/View";
		}
		else
		{
			return "redirect:/add";
		}
	}
}
