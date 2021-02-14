package cecs277RoachMotel;

import java.util.ArrayList;
import java.util.List;

/**
 * The RoachMotel class.
 * @author Neiman Peralta, Neil Manansala, Wei-Hao Chiang
 * @version 2020-05-05
 */

public class RoachMotel {
	
	/** the capacity of the motel */
	private int capacity;
	
	/** full status */
	private boolean vacancy;
	
	/** rooms available */
	private ArrayList <Integer> availableRooms;
	

	//Rooms that are taken?
	private ArrayList <RoachColony> colonyInRoom;
	
	/** name of the Motel */
	private final String name;
	
	private static RoachMotel rm;
	
	private RoomFactory rf;
	
	/**
	 * Constructor for RoachMotel
	 */
	private RoachMotel() {
		this.name = "The only motel in town";
		this.capacity = 5;
		availableRooms = new ArrayList<Integer>();
		colonyInRoom = new ArrayList<RoachColony>();
	}
	
	public static RoachMotel getInstance() {
		if (rm == null) {
			rm = new RoachMotel();
		}
		return rm;
	}
	
	public void createRooms() {
		for (int i = 101; i < (this.capacity + 101); i++) {
			this.availableRooms.add(i);
		}
		this.rf = new RoomFactory();
	}
	
	public void createRooms(int i)	{
		this.rf = new RoomFactory();
	}
	
	public MotelRoom checkIn(RoachColony rc, String roomType, ArrayList<String> amenities) {
		
		MotelRoom room = null;
		
		if(availableRooms.size() == 0) {
			this.vacancy = false;
			System.out.println("No more available rooms!");
		}
		
		else {		
			boolean found = true;
			for (int i = 101; i < this.capacity + 101; i++) {
				if (availableRooms.contains(i) == found) {
					room = rf.getRoom(roomType, amenities);
					room.setRoomNumber(i);
					this.availableRooms.remove(Integer.valueOf(i));
					rc.setRoom(room);
					colonyInRoom.add(rc);
					
					found = false;
				}
			}
		}
		return room;
	}
	
	public double checkOut(MotelRoom mr, int days, String payType) {
		double total = 0;
		total += mr.getCost();
		// int roomNum = mr.getRoomNumber();
		// if (roomNum > 100 && roomNum < 106)	{
		// 	this.availableRooms.add(roomNum);			
		// }
		if (this.availableRooms.contains(mr.getRoomNumber()) ) {
            System.out.println("Error, checking out empty room");
        }
        else {
            availableRooms.add(mr.getRoomNumber());
//            for (RoachColony removeRoom : colonyInRoom)	{
        	for (int i = 0; i < colonyInRoom.size(); i++)	{
            	if (colonyInRoom.get(i).getRoom() == mr)	{
            		colonyInRoom.remove(i);
            	}
            }
        }
		
		ArrayList<String> amen = mr.getAmenities();
		
		for (String item : amen) {
			if (item.equalsIgnoreCase("Spa")) {
				MotelRoom temp = new Spa(mr);
				total += temp.getCost();
			}
			else if (item.equalsIgnoreCase("Shower")) {
				MotelRoom temp = new Shower(mr);
				total += temp.getCost();
			}
			else if (item.equalsIgnoreCase("FoodBar")) {
				MotelRoom temp = new FoodBar(mr);
				total += temp.getCost();
			}
			else if (item.equalsIgnoreCase("Refill Bar")) {
				MotelRoom temp = new RefillBar(mr);
				total += temp.getCost();
			}
		}
		return total * days;
	}
	
	public static void spray(RoachColony rc) {
		//if shower 
		ArrayList<String> am = rc.getRoom().getAmenities();
		if (am.contains("Shower"))	{
			rc.setPopulation(rc.getPopulation() * 75 / 100);
		}
		//if no shower
		else	{
			rc.setPopulation(rc.getPopulation() * 50 / 100);
		}
		
	}
	
	/**
	 * Takes the payment from the customer.
	 * @param method The method customer use to pay for the Motel
	 * @param amount The charges when customer check out
	 */
	public void pay(PaymentStrategy method, double amount) {
		//TODO need to write into log.txt
		method.pay(amount);
	}
	
	public String toString() {
		String myStr = "";
		if (vacancy == false) {
			//If all rooms are available
			if (colonyInRoom.size() == 0)	{
				return  "Motel: " + this.name + " Room roster: Available rooms: " + availableRooms;
			}
			
			for (int i = 0; i < colonyInRoom.size(); i++)	{
				myStr += "\nRoom: " + colonyInRoom.get(i).getRoom() + "\n" + "Is Hosting: " + colonyInRoom.get(i);
			}

			return  "Motel: " + this.name + " Room roster:\n" + myStr + "\nAvailable rooms: " + availableRooms;

		}
		else {
			return "NO VACANCY";
		}
	}
	
}// end RoachMotel
