package cecs277RoachMotel;

import java.util.ArrayList;

/**
 * The RoomFactory class.
 * @author Neiman Peralta, Neil Manansala, Wei-Hao Chiang
 * @version 2020-04-20
 */
public class RoomFactory {

	/** The shared reference to the MotelRoom working copy */
	MotelRoom room;

	/**
	 * The default constructor
	 */
	public RoomFactory() {
	}

	/**
	 * The getRoom Factory Method
	 * @param roomType The type of room to create
	 * @param amenities The ameneties to add
	 * @return The created room
	 */
	public MotelRoom getRoom(String roomType, ArrayList<String> amenities) {
		// TODO: USE ENUMS FOR ROOM TYPE!
		
		ArrayList<String> tempList = new ArrayList<>();

        for (String element : amenities) { 
            if (!tempList.contains(element)) { 
                tempList.add(element); 
            }
            else {
                System.out.println("Trying to add duplicate amenity.");
                System.out.println("Error, you used the amenity " + element + " twice.");
            }
        }
        
		if (roomType.equalsIgnoreCase("Basic")) {
			room = new BasicRoom();
			room.setAmenities(tempList);
			room.setDescription("Basic Room");
			return room;
		}
		else if (roomType.equalsIgnoreCase("Deluxe")) {
			room = new DeluxeRoom();
			room.setAmenities(tempList);
			room.setDescription("Deluxe Room");
			return room;
		}
		else {
			room = new Suite();
			room.setAmenities(tempList);
			room.setDescription("Suite");
			return room;
		}
	}// end MotelRoom
}// end RoomFactory
