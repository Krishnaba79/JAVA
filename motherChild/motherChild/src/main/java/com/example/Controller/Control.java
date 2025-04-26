package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.DB.Database;
import com.example.Model.Movie;
import com.example.Model.Producer;

@Controller
public class Control {

	@Autowired
	Database db;
	@RequestMapping("/addMovie")
	public String addMovieForm(@ModelAttribute("movie")Movie movie) {
		return "addMovie";
	}

	@RequestMapping("/addProducer")
	public String addProducerForm(@ModelAttribute("producer")Producer producer) {
		return "addProducer";
	}
	
	@RequestMapping("/insertMovie")
	public String addedMovies(@ModelAttribute("movie")Movie movie) {
		
		int rows = db.insertMovie(movie);
		if(rows>0) {
			return "redirect:/viewMovie";
		}else {
			return "";
		}
		
	}
	
	@RequestMapping("/insertProducer")
	public String addedProducer(@ModelAttribute("producer")Producer producer) {
		
		int rows = db.insertProducer(producer);
		if(rows>0) {
			return "redirect:/viewProducer";
		}else {
			return "";
		}
		
	}
	
	
	@RequestMapping("/viewMovie")
	public String viewMovies(Model model) {
		List<Movie> movie = db.viewMovies();
		model.addAttribute("movie", movie);
		return "viewMovie";
	}
	
	@RequestMapping("/viewProducer")
	public String viewProducer(Model model) {
		List<Producer> producer = db.viewProducers();
		model.addAttribute("producer", producer);
		return "viewProducer";
	}
	
	@RequestMapping("/updateMovie/{id}")
	public String updateMovieForm(@PathVariable("id")int id,Model model) {
		Movie movie = db.getOne(id);
		model.addAttribute("movie", movie);
		return "updateMovie";
	}
	
	@RequestMapping("/updateProducer/{id}")
	public String updateProducerForm(@PathVariable("id")int id,Model model) {
		Producer producer = db.getOneProducer(id);
		model.addAttribute("producer", producer);
		return "updateProducer";
	}
	
	@RequestMapping("/updateMovie/updateMovie")
	public String updatedMovie(@ModelAttribute("movies")Movie movie) {
		int rows = db.updateMovie(movie);
		if(rows>0) {
			return "redirect:/viewMovie";
		} else {
			return "";
		}
	}


	@RequestMapping("/updateProducer/updateProducer")
	public String updatedProducer(@ModelAttribute("producer")Producer producer) {
		int rows = db.updateProducer(producer);
		if(rows>0) {
			return "redirect:/viewProducer";
		} else {
			return "";
		}
	}



	@RequestMapping("/deleteMovie/{id}")
	public String deleteMovie(@PathVariable("id")int id) {
	 	int rows = db.deleteMovie(id);
	 	if(rows>0) {
	 		return "redirect:/viewMovie";
	 	} else {
	 		return "";
	 	}
	}

	@RequestMapping("/deleteProducer/{id}")
	public String deleteProducer(@PathVariable("id")int id) {
	 	int rows = db.deleteProducer(id);
	 	if(rows>0) {
	 		return "redirect:/viewProducer";
	 	} else {
	 		return "";
	 	}
	}

	
}
