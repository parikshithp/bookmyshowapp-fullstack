package com.bookmyshow.Dto;

public class EventResponseDto {
    private int Eventid;
    private String Eventname;
    private int Price;
    private int Quantity;
	public EventResponseDto(int eventid, String eventname, int eventPrice, int quantity) {
		super();
		Eventid = eventid;
		Eventname = eventname;
		Price = Price;
		Quantity = quantity;
	}
	public EventResponseDto() {
		// TODO Auto-generated constructor stub
	}
	public int getEventid() {
		return Eventid;
	}
	public void setEventid(int eventid) {
		Eventid = eventid;
	}
	public String getEventname() {
		return Eventname;
	}
	public void setEventname(String eventname) {
		Eventname = eventname;
	}
	public int Price() {
		return Price;
	}
	public void setPrice(int Price) {
		Price = Price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
    
}
