package com.bookmyshow.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="showdetails")

public class ShowDetails {
	
	@ManyToOne(targetEntity = TheatreEntity.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "THEATRENAME", referencedColumnName="theatre_name")
	private String theatreName;
	
	@Column(name = "AUDI", nullable = false)
	private int audi;
	
	@Column(name = "SHOW", nullable = false)
	private int show;
	
	@Column(name = "TIME", nullable = true)
	private String time;
	
	@Column(name = "MOVIEID", nullable = true)
	private int movieId;
	
	@Id
	@Column(name = "ID", nullable = true)
	private int id;
	
	@Column(name="theatre", nullable= false)
	private int theatre;
	
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatre) {
		this.theatreName = theatre;
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
	@Override
	public String toString() {
		return "ShowDetails [id=" + id + ", theatreName=" + theatreName + ", audi=" + audi + ", show=" + show + ", movieId="
				+ movieId + ", time=" + time + "]";
	}
	
	

}
