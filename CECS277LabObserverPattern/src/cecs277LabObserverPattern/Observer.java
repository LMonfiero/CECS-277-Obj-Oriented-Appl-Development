package cecs277LabObserverPattern;


public interface Observer {
	/**
	 * The method that the subject calls on each observer/subscriber to 
	 * notify them of the changes in the weather readings.
	 * @param	temp		New temperature reading
	 * @param	humidity	New humidity reading
	 * @param	pressure	New air pressure reading
	 */
	//Old
	//public void update (float temp, float humidity, float pressure);
	
	//New
	public void update (Subject oldSubject);
}