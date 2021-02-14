package cecs277LabObserverPattern;

public class ObserverRunner {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay (weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay (weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		WindConditionsDisplay  windDisplay = new WindConditionsDisplay(weatherData);
		weatherData.setMeasurements(80,  65,  30.4f, 90, 74);
		weatherData.setMeasurements(82,  70,  29.2f, 180, 60);
		weatherData.setMeasurements(78,  90,  29.2f, 270, 150);
		System.out.println("Completed satisfactorily.");
	}

}