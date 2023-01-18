package com.bookmyshow.service;

import java.util.List;

import com.bookmyshow.model.TheatreEntity;

	public interface TheatreService {
		
		public TheatreEntity getByTheatreId(int theatreId);
		
		public List<TheatreEntity> getAllTheatres();
		
		public List<TheatreEntity> getByMovieId(int movieId);


}
