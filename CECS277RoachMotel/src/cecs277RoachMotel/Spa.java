package cecs277RoachMotel;

/**
 * The Spa RoomDecorator.
 * @author Neiman Peralta, Neil Manansala, Wei-Hao Chiang
 * @version 2020-04-20
 */
public class Spa extends RoomDecorator{

	MotelRoom motelRoom;
	private double cost;

	public Spa(MotelRoom motelRoom) {
		this.motelRoom = motelRoom;
		this.cost = 20; // TODO: Make this `static final`
	}

	/**
	 * Gets the description
	 * @return The description
	 */
	@Override
	public String getDescription() {
		return this.motelRoom.getDescription() + "Spa Room";
	}

	/**
	 * Gets the cost
	 * @return The cost
	 */
	public double getCost() {
		return this.cost;
	}

}
