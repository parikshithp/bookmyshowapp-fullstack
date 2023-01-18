package com.bookmyshow.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.bookmyshow.model.TheatreEntity;
public interface TheatreRepository extends JpaRepository<TheatreEntity,Integer>{
	
	@Query(value="Select  t.theatre_name, s.audi,s.show, st.time from theatre t, showdetails s, showtimings st where s.movieId =5 and s.show=st.showid and t.theatre_id=s.theatre order by t.theatre_name,s.audi, s.show", nativeQuery=true)
	public List<TheatreEntity> findByMovieId(int movieId);
	
	
}