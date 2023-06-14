package com.main;

public class WeatherFinderAdapter implements WeatherFinderService {
   
	private WeatherFinder weatherFinder;
	
	public WeatherFinderAdapter(WeatherFinder weatherFinder) {
		this.weatherFinder=weatherFinder;
	}
	
	@Override
	public int wheatheFindByPincode(Integer pincode) {
		int findWeatherByPincode = weatherFinder.findWeatherByPincode(pincode);
		return findWeatherByPincode;
	}

	@Override
	public int wheatherFindByCity(String city) {
		//we will write the code to get the pincode by city and then
		Integer pincode =382415;
		weatherFinder.findWeatherByPincode(pincode);
		return 40;
	}

}
