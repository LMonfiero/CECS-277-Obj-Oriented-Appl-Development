package cecs277LabObserverPattern;

import java.util.ArrayList;

public class WeatherData implements Subject {
	/** Our list of current observers. */
	private ArrayList <Observer> observers;
	/** The temperature reading */
	private float temperature;
	/** The humidity reading */
	private float humidity;
	/** The air pressure reading */
	private float pressure;
	
	//New instance variables: Direction + Speed
	private int direction;
	//Wind speed
	private int speed;

	public WeatherData () {
		this.observers = new ArrayList <> ();
	}
	@Override
	public boolean registerObserver(Observer observer) {
		if (observers.contains(observer)) {
			return false;
		} else {
			observers.add(observer);
			return true;
		}
	}

	@Override
	public boolean removeObserver (Observer observer) {
		if (observers.contains(observer)) {
			observers.remove(observer);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer next: this.observers) {
			//New
			next.update(this);
			
			//Old
			//next.update(this.temperature, this.humidity, this.pressure);
		}
	}
	
	//Getter methods
	
	// public ArrayList<Observer> getObservers()	{
	// 	return observers;
	// }
	
	public float getTemperature()	{
		return temperature;
	}

	public float getHumidity()	{
		return humidity;
	}

	public float getPressure()	{
		return pressure;
	}
	
	public int getDirection()	{
		return direction;
	}

	public int getSpeed()	{
		return speed;
	}

	//End getter methods



	/**
	 * This is a little hokey, but here goes.  Rather than call notifyObservers directly,
	 * we're going to encapsulate that a little bit, and use a method as an interface of
	 * sorts in front of notifyObservers.
	 */
	public void measurementsChanged () {
		notifyObservers();
	}
	
	/**
	 * Update one or more of the weather measurements.
	 * @param	temperature		New value for the temperature.
	 * @param	humidity		New value for the humidity.
	 * @param	pressure		New value for the barometric pressure.
	 */
	public void setMeasurements (float temperature, float humidity, float pressure, int direction, int speed) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.direction = direction;
		this.speed = speed;
		measurementsChanged();							//signal that one or more measurements have changed
	} // End of the setMeasurements member method
} // End of the WeatherDa