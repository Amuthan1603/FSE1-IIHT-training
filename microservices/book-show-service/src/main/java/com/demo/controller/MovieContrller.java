package com.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.model.Movie;

@RestController
public class MovieContrller {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/movies")
	public List<Movie> getAllMovies(){
		System.out.println("Finding all movies...");
		
		ResponseEntity<List<Movie>> responseEntity = restTemplate.exchange(
//			"http://localhost:8989/api/movies",
			"http://MOVIE-SERVER/", 
			HttpMethod.GET, 
			null, 
			new ParameterizedTypeReference<List<Movie>>() {}
		);
		
		
		return responseEntity.getBody();
	}
	
}
