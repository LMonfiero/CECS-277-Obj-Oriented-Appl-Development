package cecs277RoachMotel;

/**
 * The RoomDecorator class.
 * @author Neiman Peralta, Neil Manansala, Wei-Hao Chiang
 * @version 2020-04-20
 */
public abstract class RoomDecorator extends MotelRoom {

	/**
	 * The default constructor
	 */
	public RoomDecorator() {
	}

	/**
	 * Gets the description of the RoomDecorator
	 * @return The description
	 */
	public abstract String getDescription();

}// end RoomDecorator
