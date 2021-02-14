package cecs277RoachMotel;

/**
 * The BasicRoom class, a subclass of MotelRoom.
 * @author Neiman Peralta, Neil Manansala, Wei-Hao Chiang
 * @version 2020-04-20
 */
public class BasicRoom extends MotelRoom {

	/** The cost of the basic room */
	private double cost;

	/**
	 * The default constructor.
	 */
	public BasicRoom() {
		this.cost = 50.00;
	}

	/**
	 * The cost of the basic room.
	 * @return The cost of the basic room.
	 */
	@Override
	public double getCost() {
		return cost;
	}

}
