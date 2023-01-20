package com.bookmyshow.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Event_Tks")
public class Event {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int eventid;
    private String eventname;
    private int price;
    private int quantity;
    @ManyToOne(targetEntity = AppUser.class)
    @JoinColumn(name = "user_id")
    private AppUser user;
	public Event(int eventid, String eventname, int price, int quantity, AppUser user) {
		super();
		this.eventid = eventid;
		this.eventname = eventname;
		this.price = price;
		this.quantity = quantity;
		this.user = user;
	}
	public Event(String eventname, int price, int quantity, AppUser user) {
		super();
		this.eventname = eventname;
		this.price = price;
		this.quantity = quantity;
		this.user = user;
	}
	public Event() {
		// TODO Auto-generated constructor stub
	}
	public int getEventid() {
		return eventid;
	}
	public void setEventid(int eventid) {
		this.eventid = eventid;
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
	public AppUser getUser() {
		return user;
	}
	public void setUser(AppUser user) {
		this.user = user;
	}
    
}
