package com.main;

public class Wifi extends FlightSeatDecorator {
     
	private static final String WIFI = "wifi";

	public Wifi(FlightSeat flightSeat) {
		super(flightSeat);
	}
	
	@Override
	public String getFasilities() {
	return	this.flightSeat.getFasilities()+WIFI;
	}

	@Override
	public Double getCost() {
		return 	this.flightSeat.getCost()+ 150.00;
		
	}

}
