package com.main;

public class Main {

	public static void main(String[] args) {
		
      System.out.println("rushik");
      
      FlightSeat cabinSeatWithHAdphonewithWifi = new Wifi(new Headphone(new MainCabinSeat()));
      
      Double cost = cabinSeatWithHAdphonewithWifi.getCost();
      
      System.out.println(cost);
      
      String fasilities = cabinSeatWithHAdphonewithWifi.getFasilities();
      
      System.out.println(fasilities);
	}
}
