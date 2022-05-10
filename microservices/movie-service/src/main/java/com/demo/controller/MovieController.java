package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Movie;
import com.demo.services.MovieService;

@RestController
public class MovieController {

	@Autowired
	private MovieService service;
	
	@GetMapping("")
	public List<Movie> allMovies(){
		return service.findMovies();
	}
	
	@PostMapping("")
	public Movie saveMovie(@RequestBody Movie movie){
		return service.createMovie(movie);
	}
	
	
	
}
