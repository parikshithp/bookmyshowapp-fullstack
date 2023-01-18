package com.bookmyshow.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmyshow.model.TheatreEntity;
import com.bookmyshow.repository.TheatreRepository;
import com.bookmyshow.service.TheatreService;

@Service
public class TheatreServiceImpl implements TheatreService{
		
		@Autowired
		TheatreRepository theatrerepository;

		@Override
		public TheatreEntity getByTheatreId(int theatreId) {
				
			return theatrerepository.getById(theatreId);
		}

		@Override
		public List<TheatreEntity> getAllTheatres() {
			List<TheatreEntity> result = theatrerepository.findAll();
			return result;
		}
		
		@Override
		public List<TheatreEntity> getByMovieId(int movieId) {
			return theatrerepository.findByMovieId(movieId);
			
		}
		

	}
