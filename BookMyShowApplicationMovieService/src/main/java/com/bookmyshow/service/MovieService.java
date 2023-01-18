package com.bookmyshow.service;

import java.util.List;

import com.bookmyshow.model.MovieEntity;

public interface MovieService {
	
 public List<MovieEntity> getAllMovies();

 public MovieEntity findMovieById(int movieId);

 public List<MovieEntity> getMovieByLanguage(String language);
 
 public List<MovieEntity> findMovieByGenre(String genre);

public MovieEntity findMovieByTitle(String title);
}
