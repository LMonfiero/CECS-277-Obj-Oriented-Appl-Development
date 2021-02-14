package cecs277RoachMotel;

/**
 * The RefillBar class.
 * @author Neiman Peralta, Neil Manansala, Wei-Hao Chiang
 * @version 2020-04-20
 */
public class RefillBar extends RoomDecorator {

	/** The room this RefillBar is decorating */
	MotelRoom motelRoom;

	/** The cost of the RefillBar */
	private double cost;

	public RefillBar(MotelRoom motelRoom) {
		this.motelRoom = motelRoom;
		this.cost = 5; // TODO: Make this `static final`
	}

	/**
	 * Gets the description of the RefillBar
	 * @return The description of the refill bar
	 */
	@Override
	public String getDescription() {
		return motelRoom.getDescription() + "Auto refill the bar";
	}

	/**
	 * The cost of the refill bar
	 * @return The cost of the refill bar
	 */
	public double getCost() {
		return this.cost;
	}

}
