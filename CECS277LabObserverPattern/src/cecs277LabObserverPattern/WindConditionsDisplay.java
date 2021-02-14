package cecs277LabObserverPattern;

public class WindConditionsDisplay implements Observer, DisplayElement {
	/** The direction that we pick up from the weatherData */
	private int direction;
	/** The old speed */
	private int lastSpeed = 75;
	
	/** The current speed */
	private int currentSpeed;
	/** The  Subject instance that we are going to subscribe to. */
	private Subject weatherData;
	
	/**
	 * Constructor for this concrete implementation of the Observer interface.
	 * @param	weatherData	The subject that we're observing.  We could have
	 * 						subscribed in the main program just as easily.
	 */
	public WindConditionsDisplay(Subject weatherData) {
		//Aggregate the weatherData Subject instance for later reference
		this.weatherData = weatherData;
		//Tell that Subject that we are interested in observing them.
		//I don't pick up the return value from registerObserver because I 
		//know that I cannot be in that list yet since I just got created.
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		String compass = "";
		if (this.direction == 90)	{
			compass = "West";
		}
		
		else if (this.direction == 180)	{
			compass = "North";
		}
		
		else if (this.direction == 270)	{
			compass = "East";
		}
		
		else if (this.direction == 0 || this.direction == 360)	{
			compass = "South";
		}
		
		String speedWarning = "";
		
		if (currentSpeed > 100)	{
			speedWarning += "WARNING! Wind Speeds above 100mph, seek shelter immediately!";
		}
		
		else if (currentSpeed < 100 && currentSpeed > 50)	{
			//Speed is increasing; getting worse
			if (lastSpeed < currentSpeed)	{
				speedWarning += "Warning! Wind Speeds are above 50mph and getting worse, prepare to seek shelter!";
			}
			
			//Speed is decreasing; getting better
			else if (lastSpeed > currentSpeed)	{
				speedWarning += "No need for worry -- Wind speed is descending and beginning to moderate";
			}
		}
		
		System.out.println(compass + " " + speedWarning);
	}

	@Override
	public void update(Subject oldSubject) {
		WeatherData updatedSubject = (WeatherData) oldSubject;
		this.direction = updatedSubject.getDirection();
		lastSpeed = currentSpeed;
		currentSpeed = updatedSubject.getSpeed();
		this.display();
	}
}
