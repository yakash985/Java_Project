package com.capgemini.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.model.Bus;

public class BusDaoImpl implements BusDao{
	
	private static List<Bus> busList = new ArrayList<Bus>();
	
	
	static {
		String boardingStops1[] = {"Mumbai","Panvel","Lonaval"};
		String dropingStops1[] = {"Panvel","Lonaval","Pune"};
		Bus mumToPune = new Bus("Mumbai-Pune", "MH04NX1356", "Mumbai", "Pune", boardingStops1, dropingStops1, 20, "Dan Bravo");
		
		String boardingStops2[] = {"Panvel","Lonaval","Pune"};
		String dropingStops2[] = {"Lonaval","Pune","Satara"};
		Bus  panvelToSatara= new Bus("Panvel-Satara", "MH05NX1487", "Panvel", "Satara", boardingStops2, dropingStops2, 20, "Bhuvan Signh");
		
		busList.add(mumToPune);
		busList.add(panvelToSatara);
		
	}
	
	
	//search bus
	//createbus(Bus bus)
//	updatestmt:- 
//	addbusBoardingStops(String busNumber,String StopName)
//	{
//	search for bus in busList using busnumber
//	once we get the bus
//	then add the busStop in BoardingStops array field of that bus object using addBoardStop in Bus class 
//	
//	}

}
