package com.bookmyshow.Dto;
	
public class TheatreDto {
	
	private String theatreName;
	private int audi;
	private int show;
	private String date;
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "TheatreDto [theatreName=" + theatreName + ", audi=" + audi + ", show=" + show + ", date=" + date + "]";
	}
	
	
}
