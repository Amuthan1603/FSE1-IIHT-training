package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Movie;
import com.demo.repositories.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository repo;
	
	public List<Movie> findMovies(){
		return repo.findAll();
	}
	
	public Movie createMovie(Movie movie) {
		return repo.save(movie);
	}
	
}
