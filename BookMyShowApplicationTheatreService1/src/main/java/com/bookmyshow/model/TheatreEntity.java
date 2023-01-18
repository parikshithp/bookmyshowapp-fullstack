package com.bookmyshow.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "THEATRE")
public class TheatreEntity {

	@Id
	@Column(name = "THEATRE_ID", nullable=false)
	private int theatreId;
	
	@Column(name = "THEATRE_NAME", nullable = false)
	private String theatreName;

	@Column(name = "TOTAL_SEATS", nullable = false)
	private String totalSeats;
	
	@Column(name = "TOTAL_AUDIS", nullable = false)
	private String totalAudis;
	

	public String getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(String totalSeats) {
		this.totalSeats = totalSeats;
	}

	public String getTotalAudis() {
		return totalAudis;
	}

	public void setTotalAudis(String totalAudis) {
		this.totalAudis = totalAudis;
	}

	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public TheatreEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	
	
}
