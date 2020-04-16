package com.capgemini.model;

import java.util.Date;

public class Ticket {
	private Long ticketNo =2020001l;
	private String passengerName;
	private String busName;
	private String busNo;
	private String source;
	private String destination;
	private double fare;
//	????private Date date;//this we will do it in next phases
	public Ticket(String passengerName, String busName, String busNo, String source, String destination, double fare) {
		ticketNo = ticketNo + 1;
		this.passengerName = passengerName;
		this.busName = busName;
		this.busNo = busNo;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
	}
	public Long getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(Long ticketNo) {
		this.ticketNo = ticketNo;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	

	
}
