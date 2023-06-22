package com.main;

public abstract class FlightSeatDecorator implements FlightSeat {
      
	protected FlightSeat flightSeat;
	
	public FlightSeatDecorator(FlightSeat flightSeat) {
		this.flightSeat=flightSeat;
	}
	
	public abstract String getFasilities();
	   public abstract Double getCost();
	
}
