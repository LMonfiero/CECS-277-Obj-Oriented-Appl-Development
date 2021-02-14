package cecs277RoachMotel;

/**
 * The Suite MotelRoom
 * @author Neiman Peralta, Neil Manansala, Wei-Hao Chiang
 * @version 2020-04-20
 */
public class Suite extends MotelRoom {

	/** The cost of the Suite */
	private double cost;

	/**
	 * The default constructor.
	 */
	public Suite() {
		this.cost = 100.00;
	}

	/**
	 * Gets the cost of the suite.
	 * @return
	 */
	@Override
	public double getCost() {
		return cost;
	}

}
