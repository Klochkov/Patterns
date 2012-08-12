package Patterns.observer;

public class WeatherStation {

	public static void main(String[] args) {
	
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = 
				new CurrentConditionsDisplay(weatherData);
		//StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		
		weatherData.setMeasurement(88, 66, 30.4f);
	}

}
