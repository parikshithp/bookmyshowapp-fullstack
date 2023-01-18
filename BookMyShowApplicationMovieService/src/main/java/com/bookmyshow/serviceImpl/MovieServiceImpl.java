package com.bookmyshow.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmyshow.model.MovieEntity;
import com.bookmyshow.repository.MovieRepository;
import com.bookmyshow.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieRepository movierepository;


	@Override
	public List<MovieEntity> getAllMovies() {
		return movierepository.findAll();
	}
	
	@Override
	public MovieEntity findMovieById(int movieId) {
		return movierepository.findByMovieId(movieId);
	}
	@Override
	public List<MovieEntity> getMovieByLanguage(String language) {
		return movierepository.findByLanguage(language);
	}
	
	
	  @Override 
	  public List<MovieEntity> findMovieByGenre(String genre) { 
		  return movierepository.findByGenre(genre); }

	@Override
	public MovieEntity findMovieByTitle(String title) {
		return movierepository.findByTitle(title);
	}
	 
	}