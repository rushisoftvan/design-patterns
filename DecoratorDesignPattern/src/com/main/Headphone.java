package com.main;

public class Headphone extends FlightSeatDecorator {
    
	private static final String HEADPHONE = "Headphone";

	public Headphone(FlightSeat flightSeat) {
		super(flightSeat);
	}
	
	@Override
	public String getFasilities() {
	  return this.flightSeat.getFasilities()+HEADPHONE;
	}

	@Override
	public Double getCost() {
		// TODO Auto-generated method stub
		return this.flightSeat.getCost()+200.00;
	}

}
