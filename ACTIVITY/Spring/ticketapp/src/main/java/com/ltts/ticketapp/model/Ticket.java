package com.ltts.ticketapp.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ticketid;
	private String mobile;
	private String moviename;
	private int nooftickets;
	private LocalDate bookingDate;
	private LocalDate showdate;
	private LocalTime showtime;
	private String tickettype;
	private int totalamount;
	
public Ticket(int ticketid, String mobile, String moviename, int nooftickets, LocalDate bookingDate,
		LocalDate showdate, LocalTime showtime, String tickettype, int totalamount) {
	super();
	this.ticketid = ticketid;
	this.mobile = mobile;
	this.moviename = moviename;
	this.nooftickets = nooftickets;
	this.bookingDate = bookingDate;
	this.showdate = showdate;
	this.showtime = showtime;
	this.tickettype = tickettype;
	this.totalamount = totalamount;
}
public Ticket() {
	super();
	// TODO Auto-generated constructor stub
}
public int getTicketid() {
	return ticketid;
}
public void setTicketid(int ticketid) {
	this.ticketid = ticketid;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getMoviename() {
	return moviename;
}
public void setMoviename(String moviename) {
	this.moviename = moviename;
}
public int getNooftickets() {
	return nooftickets;
}
public void setNooftickets(int nooftickets) {
	this.nooftickets = nooftickets;
}
public LocalDate getBookingDate() {
	return bookingDate;
}
public void setBookingDate(LocalDate bookingDate) {
	this.bookingDate = bookingDate;
}
public LocalDate getShowdate() {
	return showdate;
}
public void setShowdate(LocalDate showdate) {
	this.showdate = showdate;
}
public LocalTime getShowtime() {
	return showtime;
}
public void setShowtime(LocalTime showtime) {
	this.showtime = showtime;
}
public String getTickettype() {
	return tickettype;
}
public void setTickettype(String tickettype) {
	this.tickettype = tickettype;
}
public int getTotalamount() {
	return totalamount;
}
public void setTotalamount(int totalamount) {
	this.totalamount = totalamount;
}
}
