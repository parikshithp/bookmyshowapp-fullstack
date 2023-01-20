package com.bookmyshow.service;

import java.util.List;

import com.bookmyshow.Dto.TheatreDto;
import com.bookmyshow.model.ShowDetails;
import com.bookmyshow.model.TheatreEntity;

	public interface TheatreService {
		
		public TheatreEntity getByTheatreId(int theatreId);
		
		public List<TheatreEntity> getAllTheatres();
		
		public List<ShowDetails> getByMovieId(int movieId);


}
