package com.main;

public class Main {
  public static void main(String[] args) {
	WeatherFinderService weatherFinderAdapter = new WeatherFinderAdapter(new WeatherFinderImp());
	int wheatherFindByCity = weatherFinderAdapter.wheatherFindByCity("ahmedabad");
	 System.out.println(wheatherFindByCity);
}
}
