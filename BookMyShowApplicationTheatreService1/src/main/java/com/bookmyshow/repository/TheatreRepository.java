package com.bookmyshow.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bookmyshow.Dto.TheatreDto;
import com.bookmyshow.model.ShowDetails;
import com.bookmyshow.model.TheatreEntity;
public interface TheatreRepository extends JpaRepository<TheatreEntity,Integer>{
	
	@Query(value="select  t.theatre_name, s.audi,s.show, s.time from theatre t,showdetails s where s.movieId =5 and s.theatre=t.theatre_id order by s.theatrename,s.audi, s.show", nativeQuery=true)
	public List<ShowDetails> findByMovieId(int movieId);
	
	
}