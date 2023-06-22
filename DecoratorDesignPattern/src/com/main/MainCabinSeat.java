package com.main;

public class MainCabinSeat implements FlightSeat {

	@Override
	public String getFasilities() {
		return "Free Food";
		
	}

	@Override
	public Double getCost() {
		// TODO Auto-generated method stub
		return 500.00;
	}

}
