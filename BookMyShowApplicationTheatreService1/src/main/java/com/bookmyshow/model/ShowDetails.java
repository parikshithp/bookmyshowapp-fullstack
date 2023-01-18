package com.bookmyshow.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="showdetails")

public class ShowDetails {
	
	@Id
	@Column(name = "ID", nullable = true)
	private int id;
	
	@Column(name = "THEATRE", nullable = false)
	private int theatre;
	
	@Column(name = "AUDI", nullable = false)
	private int audi;
	
	@Column(name = "SHOW", nullable = false)
	private int show;
	
	@Column(name = "MOVIEID", nullable = true)
	private int movieId;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTheatre() {
		return theatre;
	}
	public void setTheatre(int theatre) {
		this.theatre = theatre;
	}
	public int getAudi() {
		return audi;
	}
	public void setAudi(int audi) {
		this.audi = audi;
	}
	public int getShow() {
		return show;
	}
	public void setShow(int show) {
		this.show = show;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public ShowDetails(int theatre, int audi, int show, int movieId) {
		super();
		this.theatre = theatre;
		this.audi = audi;
		this.show = show;
		this.movieId = movieId;
	}
	public ShowDetails() {
		super();
	}
	@Override
	public String toString() {
		return "ShowDetails [theatre=" + theatre + ", audi=" + audi + ", show=" + show + ", movieId=" + movieId + "]";
	}
	

}
