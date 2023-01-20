package com.bookmyshow.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmyshow.model.MovieEntity;
import com.bookmyshow.service.MovieService;

@RestController
public class MovieController {
	
	@Autowired
	private MovieService movieservice;
	
	@GetMapping("/movies")
	public List<MovieEntity> getAllMovies()
	{
		return movieservice.getAllMovies();
	}
	
	@GetMapping(value = "/movies/{movieID}")
	public MovieEntity findMovieById(@PathVariable("movieID") int movieId)
	{
		return movieservice.findMovieById(movieId);
	}
	
	@GetMapping(value = "/title/{title}") 
	  public MovieEntity getMovieByTitle(@PathVariable("title") String title) { 
		  return movieservice.findMovieByTitle(title); }
	
	  @GetMapping(value = "/{genre}") 
	  public List<MovieEntity> getMovieByGenre(@PathVariable("genre") String genre) { 
		  return movieservice.findMovieByGenre(genre); }
	 
	
	@GetMapping(value = "/movie/{lang}")
	public List<MovieEntity> getMovieByLanguage(@PathVariable("lang") String language)
	{
		return movieservice.getMovieByLanguage(language);
	}
	}
