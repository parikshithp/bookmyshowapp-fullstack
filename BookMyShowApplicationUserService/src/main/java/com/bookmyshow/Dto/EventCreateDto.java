package com.bookmyshow.Dto;

public class EventCreateDto {
	    private String eventname;
	    private int price;
	    private int quantity;
		public EventCreateDto(String eventname, int price, int quantity) {
			super();
			this.eventname = eventname;
			this.price = price;
			this.quantity = quantity;
		}
		public String getEventname() {
			return eventname;
		}
		public void setEventname(String eventname) {
			this.eventname = eventname;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
	    
}
