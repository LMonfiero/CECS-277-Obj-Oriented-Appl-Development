package cecs277LabObserverPattern;

/**
 * This ConcreteObserver makes some simplistic projections about the weather
 * based on the current readings.  But it is an OK example of the sort of 
 * differences and similarities that you might have for different implementations
 * of the Observer interface.
 */
public class ForecastDisplay implements DisplayElement, Observer {

	/** Current air pressure for comparison*/
	private float currentPressure = 29.92f; 
	/** Most recent air pressure reading */
	private float lastPressure;
	/** The Subject that we're observing */
	private Subject weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void update(Subject oldSubject) {
		WeatherData updatedSubject = (WeatherData) oldSubject;
		lastPressure = currentPressure;
		currentPressure = updatedSubject.getPressure();
		display();
	}
	
	//Old
	/*public void update(float temp, float humidity, float pressure) {
		lastPressure = currentPressure;
		currentPressure = pressure;
		display();
	}*/

	@Override
	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}