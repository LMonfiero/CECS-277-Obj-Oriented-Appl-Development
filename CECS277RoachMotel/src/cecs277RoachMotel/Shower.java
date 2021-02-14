package cecs277RoachMotel;

/**
 * The Shower RoomDecorator.
 * @author Neiman Peralta, Neil Manansala, Wei-Hao Chiang
 * @version 2020-04-20
 */
public class Shower extends RoomDecorator {

	/** The MotelRoom for the shower */
	MotelRoom motelRoom;
	private double cost;

	public Shower(MotelRoom motelRoom) {
		this.motelRoom = motelRoom;
		this.cost = 25; // TODO: Make this `static final`
	}

	/**
	 * Gets the description for the Shower.
	 * @return The description for the shower.
	 */
	@Override
	public String getDescription() {
		 return this.motelRoom.getDescription() + "Shower Room";
	}

	/**
	 * Gets the cost of the Shower
	 * @return The cost of the shower
	 */
	public double getCost() {
		return this.cost;
	}

}
