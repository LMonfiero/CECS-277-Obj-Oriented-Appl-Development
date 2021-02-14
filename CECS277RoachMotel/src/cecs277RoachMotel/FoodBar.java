package cecs277RoachMotel;

/**
 * The FoodBar class, a MotelRoom decorator.
 */
public class FoodBar extends RoomDecorator {

	/** The MotelRoom this FoodBar is decorating */
	private MotelRoom motelRoom;

	/** The cost of the FoodBar decorator */
	private double cost;

	/**
	 * A parametric constructor accepting a MotelRoom to decorate
	 * @param motelRoom
	 */
	public FoodBar(MotelRoom motelRoom) {
		this.motelRoom = motelRoom;
		this.cost = 20; // TODO: Make this `static final`
	}

	/**
	 * The description of this RoomDecorator
	 * @return The description of the motel room, along with "Food Bar Room"
	 */
	@Override
	public String getDescription() {
		return this.motelRoom.getDescription() + "Food Bar Room";
	}

	/**
	 * The cost of this RoomDecorator
	 * @return
	 */
	public double getCost() {
		return this.cost;
	}

}// end FoodBar
