package com.bookmyshow.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="showtimings")
	
	public class ShowTimings {
		
		@Id
		@Column(name = "SHOWID", nullable = true)
		private int showId;
		
		@Column(name = "TIME", nullable = true)
		private String time;

		public int getShowId() {
			return showId;
		}

		public void setShowId(int showId) {
			this.showId = showId;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}
		
		
	}

