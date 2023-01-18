package com.bookmyshow.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bookmyshow.model.MovieEntity;

	@Repository
	public interface MovieRepository extends JpaRepository<MovieEntity,Integer>{
		
		@Query(value = "select * from movie", nativeQuery = true)
		
		public Integer getMovieId();
		
		public MovieEntity findByMovieId(int movieId);
		
		@Query(value = "select * from movie WHERE LANGUAGE =:language", nativeQuery = true)
		public List<MovieEntity> findByLanguage(String language);
		
		  @Query(value="select * from MOVIE where GENRE =:genre", nativeQuery=true)
		  public List<MovieEntity> findByGenre(String genre);
		  
		  @Query(value="select * from MOVIE where TITLE =:title", nativeQuery=true)
		  public MovieEntity findByTitle(String title);
		  
		  
		 
}
