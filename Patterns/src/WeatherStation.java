public class WeatherStation {

	public static void main(String[] args) {
	
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = 
				new CurrentConditionsDisplay(weatherData);
		//StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		
		weatherData.setMeasurement(80, 65, 30.4f);
	}

}
