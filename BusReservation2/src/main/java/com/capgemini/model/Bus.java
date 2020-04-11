package com.capgemini.model;

public class Bus {

	private String busName;
	private String busNumber;
	private String source;
	private String destination;
	private int numberOfSeats;
	private String seatArrangement[] = new String[numberOfSeats];
	public Bus(String busName, String busNumber, String source, String destination, int numberOfSeats) {
		super();
		this.busName = busName;
		this.busNumber = busNumber;
		this.source = source;
		this.destination = destination;
		this.numberOfSeats = numberOfSeats;
	}
	
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
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
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	
	
	
	
}
