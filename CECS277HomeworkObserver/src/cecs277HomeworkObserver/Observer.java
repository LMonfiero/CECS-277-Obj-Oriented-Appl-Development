package cecs277HomeworkObserver;


public interface Observer {
	/**
	 * The method that the subject calls on each observer/subscriber to 
	 * notify them of the changes in the weather readings.
	 * @param	temp		New temperature reading
	 * @param	humidity	New humidity reading
	 * @param	pressure	New air pressure reading
	 */
	public void update (Subject sub);
}