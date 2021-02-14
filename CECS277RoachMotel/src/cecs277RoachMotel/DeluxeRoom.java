package cecs277RoachMotel;

/**
 * The DeluxeRoom class, a subclass of MotelRoom.
 * @author Neiman Peralta, Neil Manansala, Wei-Hao Chiang
 * @version 2020-04-20
 */
public class DeluxeRoom extends MotelRoom {

	/** The cost of the deluxe room */
	private double cost;

	/**
	 * The default constructor.
	 */
	public DeluxeRoom() {
		this.cost = 75.00;
	}

	/**
	 * The cost of the deluxe room.
	 * @return The cost of the deluxe room.
	 */
	@Override
	public double getCost() {
		return cost;
	}

}
