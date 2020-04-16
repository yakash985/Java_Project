package com.capgemini.service;

import com.capgemini.dao.FareDao;
import com.capgemini.dao.FareDaoImpl;
import com.capgemini.dao.TicketDao;
import com.capgemini.dao.TicketDaoImpl;
import com.capgemini.model.Bus;
import com.capgemini.model.Passenger;
import com.capgemini.model.Ticket;

public class BookTicketImpl implements BookTicket {
	private static TicketDao ticketDao = new TicketDaoImpl();
	private static FareDao fareDao= new FareDaoImpl();
	@Override
	public String bookTicket(String source, String destination, Bus bus, Passenger pssgn, int seatNumber) {
		
		//calculate fare
		double fare = fareDao.calculateFare(source, destination, bus, pssgn);
		Ticket ticket = new Ticket(pssgn.getPassengerName(), bus.getBusName(), bus.getBusName(), source, destination, fare);
		boolean res = ticketDao.storeTicketInDatabase(ticket);
		if(res) {
			return "Your ticket is confirmed and it as follows:\n"+showTicket(source, destination, bus, pssgn, seatNumber);
		}
		else {
			return "Booking failed";
			//here exception can also come but for time being retur the message
		}
		
		/*
		 * Bus Name = bus.busName;
		 * Bus starts from =bus.startStop;
		 * Bus final destination=bus.startStop;
		 * Your:
		 * Boarding point= source;
		 * Dropping point =destination
		 * Date and time pending????
		 * 
		 * Seat No = seatNumber;
		 * Passenger details
		 * Name = pssgn.PassengerName;
		 * gender = pssgn.gender;
		 * age = pssgn.age; 
		 * 
		 * 
		 **/
	}

	@Override
	public String showTicket(String source, String destination, Bus bus, Passenger pssgn, int seatNumber) {
		/*
		 * Bus Name = bus.busName;
		 * Bus starts from =bus.startStop;
		 * Bus final destination=bus.startStop;
		 * Your:
		 * Boarding point= source;
		 * Dropping point =destination
		 * Date and time pending????
		 * 
		 * Seat No = seatNumber;
		 * Passenger details
		 * Name = pssgn.PassengerName;
		 * gender = pssgn.gender;
		 * age = pssgn.age; 
		 * 
		 **/
		
		//calculate fare
		double fare = fareDao.calculateFare(source, destination, bus, pssgn);
		return "Bus Name : "+bus.getBusName()+"\n"
					+"Bus starts from : "+bus.getStartStop()+"\n"
					+"Bus final destination : "+bus.getEndStop()+"\n"
					+"Your : \n"
					+"Boarding point : "+source+"\n"
					+"Dropping point : "+destination+"\n"
					+"Seat Number : "+seatNumber+"\n"
					+"Passenger details : \n"
					+"Name : "+pssgn.getPassengerName()+"\n"
					+"Gender : "+pssgn.getGender()+"\n"
					+"Age : "+pssgn.getAge()+"\n"
					+"Fare : "+fare+"\n";
					
	}



}
