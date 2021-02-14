package cecs277RoachMotel;

import java.util.ArrayList;

/**
 * The MotelRoom abstract class.
 * @author Neiman Peralta, Neil Manansala, Wei-Hao Chiang
 * @version 2020-04-20
 */
public abstract class MotelRoom {

	/** The description for the MotelRoom */
	private String description;

	/** The room number */
	private int roomNumber;

	/** The MotelRoom's amenities */
	private ArrayList<String> amenities;
	
	private double total;

	/**
	 * The default constructor.
	 */
	public MotelRoom() {
		this.description = "";
		this.total = 0.0;
	}

	/**
	 * Gets the description
	 * @return The description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Gets the amenities
	 * @return The amenities
	 */
	public ArrayList<String> getAmenities() {
		return this.amenities;
	}

	/**
	 * Sets the amenities
	 * @param amenities The amenities
	 */
	public void setAmenities(ArrayList<String> amenities) {
		this.amenities = amenities;
	}

	/**
	 * Sets the room number
	 * @param roomNumber The room number
	 */
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	/**
	 * Gets the room number
	 * @return The room number
	 */
	public int getRoomNumber() {
		return this.roomNumber;
	}

	/**
	 * Gets the cost
	 * @return The cost
	 */
	public abstract double getCost();
	
	public void setDescription(String descr)	{ this.description = descr;	}

	/**
	 * The description of the room
	 * @return The description
	 */
	public String toString() {
//		for (String myStr : ArrayList<String> amenities);
//		String str;
		for (String myStr : amenities)	{
			description += ", " + myStr;
		}
		
		for (String item : amenities) {
			if (item.equalsIgnoreCase("Spa")) {
				MotelRoom temp = new Spa(this);
				total += temp.getCost();
			}
			else if (item.equalsIgnoreCase("Shower")) {
				MotelRoom temp = new Shower(this);
				total += temp.getCost();
			}
			else if (item.equalsIgnoreCase("FoodBar")) {
				MotelRoom temp = new FoodBar(this);
				total += temp.getCost();
			}
			else if (item.equalsIgnoreCase("Refill Bar")) {
				MotelRoom temp = new RefillBar(this);
				total += temp.getCost();
			}
		} 
//		description = description.substring(0, description.length() - 2);//remove comma and space
		return "Room Number: " + this.getRoomNumber() + " " + this.getDescription() + " Cost: $" + (total + this.getCost());
	}

}// end MotelRoom
