package com.bookmyshow.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bookmyshow.Dto.TheatreDto;
import com.bookmyshow.model.ShowDetails;
import com.bookmyshow.model.TheatreEntity;
import com.bookmyshow.service.TheatreService;

@RestController
public class TheatreController {
	
	@Autowired
	private TheatreService theatreservice;
	
	
	@GetMapping("/theatreByMovieId/{movieId}")
	public List<ShowDetails> getTheatreByMovieId(@PathVariable("movieId") int movieId){
		List<ShowDetails> theatre = theatreservice.getByMovieId(movieId);
		return theatre.stream().collect(Collectors.toSet()).stream().toList();
	}
	
	
}

