package com.bookmyshow.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="MOVIE")

public class MovieEntity {

	@Id
	@Column(name = "MOVIE_ID", nullable = false)
	private int movieId;
	
	@Column(name = "TITLE", nullable = false)
	private String title;
	
	@Column(name = "DESCRIPTION", nullable = false)
	private String description;
	
	@Column(name = "DURATION", nullable = false )
	private int duration;
	
	@Column(name = "LANGUAGE", nullable = false)
	private String language;
		
	@Column(name = "RELEASE_DATE",columnDefinition = "DATE" , nullable = false)
	private LocalDate releaseDate;
	
	@Column(name = "GENRE", nullable = false)
	private String genre;
	
	@Column(name = "IMAGELINK", nullable = true)
	private String imagelink;
	
	@Column(name = "EMBEDID", nullable = true)
	private String embedId;

	public String getEmbedId() {
		return embedId;
	}

	public void setEmbedId(String embedId) {
		this.embedId = embedId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getGenre() {
		return genre;
	}

	public String getImagelink() {
		return imagelink;
	}

	public void setImagelink(String imagelink) {
		this.imagelink = imagelink;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "MovieEntity [movieId=" + movieId + ", title=" + title + ", description=" + description + ", duration="
				+ duration + ", language=" + language + ", releaseDate=" + releaseDate + ", genre=" + genre + ", imagelink="+imagelink+", embedId="+embedId+"]";
	}

	//

	
	}
