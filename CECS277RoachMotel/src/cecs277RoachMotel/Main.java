package cecs277RoachMotel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
		
		Logger.setFile("LocalLog.txt");
		Logger.Slog("Test Log message");
		Logger myLog = Logger.getLogger();
		
		// create motel
    	RoachMotel Roach76 = RoachMotel.getInstance();
    	Roach76.createRooms();
    	
    	// create Roach Colonies
    	RoachColony rc1 = new RoachColony("Roachman", 100, 1.2);
    	RoachColony rc2 = new RoachColony("WeiRoach", 50, 5);
    	RoachColony rc3 = new RoachColony("Roacheil", 9000, 3);
    	RoachColony rc4 = new RoachColony("Austroach", 1337, 4);
    	RoachColony rc5 = new RoachColony("BrownRoach", 277, 5);
    	RoachColony rc6 = new RoachColony("Sixth Colony",600,6);
    	RoachColony rc7 = new RoachColony("Seventh Colony",700,7);
    	RoachColony rc8 = new RoachColony("Eigth Colony",800,8);
    	RoachColony rc9 = new RoachColony("Ninth Colony",900,9);

    	
    // create rooms and log into txt
		myLog.log(RoachMotel.getInstance().toString());	

		// set amenities hard coding for now 
		//Checking for Amenimoentiess
		//Has duplicates, making sure it doesn't add anything
		ArrayList<String> amen1 = new ArrayList<String>();
		amen1.add("Foodbar");
		amen1.add("Refill bar");
		amen1.add("Spa");
		amen1.add("Shower");
		amen1.add("Foodbar");
		amen1.add("Refill bar");
		amen1.add("Spa");
		amen1.add("Shower");
		amen1.add("Foodbar");
		amen1.add("Refill bar");
		amen1.add("Spa");
		amen1.add("Shower");
		
		
		ArrayList<String> amen2 = new ArrayList<String>();
		amen2.add("Refill bar");
		amen2.add("Spa");
		amen2.add("Shower");
		
		ArrayList<String> amen3 = new ArrayList<String>();
		amen3.add("Spa");
		amen3.add("Shower");
		
		ArrayList<String> amen4 = new ArrayList<String>();
		amen4.add("Spa");
		
		ArrayList<String> amen5 = new ArrayList<String>();
		amen5.add("Foodbar");
		amen5.add("Refill Bar");
		
		ArrayList<String> amen6 = new ArrayList<String>();
		amen6.add("FoodBar");
		amen6.add("Refill bar");
		amen6.add("Spa");
		
		ArrayList<String> amen7 = new ArrayList<String>();
		amen7.add("FoodBar");
		amen7.add("Spa");
		
		ArrayList<String> amen8 = new ArrayList<String>();
		amen8.add("FoodBar");
		amen8.add("Refill bar");
		amen8.add("Shower");
		
		ArrayList<String> amen9 = new ArrayList<String>();
		amen9.add("FoodBar");
		amen9.add("Spa");

		// check in
		//  public MotelRoom checkIn(RoachColony rc, String roomType, ArrayList<String> amenities);
		System.out.println(Roach76);
		System.out.println();
		MotelRoom mr1 = Roach76.checkIn(rc1,  "Basic",  amen1);
		MotelRoom mr2 = Roach76.checkIn(rc2, "Deluxe", amen2);
		MotelRoom mr3 = Roach76.checkIn(rc3,  "Basic",  amen3);
		MotelRoom mr4 = Roach76.checkIn(rc4, "Deluxe", amen4);
		MotelRoom mr5 = Roach76.checkIn(rc5,  "Suite",  amen5);
		// mr2 = Roach76.checkIn(rc6, "Basic", amen6);
		// mr3 = Roach76.checkIn(rc7,  "Deluxe",  amen7;
		// mr4 = Roach76.checkIn(rc8, "Suite", amen8);
		// mr5 = Roach76.checkIn(rc9,  "Basic",  amen9);
		myLog.log(rc1 + " safely registered with amenities: " + mr1.getAmenities());
		System.out.println();
		System.out.println("Check In: " + rc1 + " was assigned " + mr1.getDescription());
		System.out.println("First Room: " + mr1);
//		System.out.println(mr2);
//		System.out.println(mr3);
//		System.out.println(mr4);
//		System.out.println(mr5);
		
		
		
		//rc2.party();
		
		// check out
		double coTotal = Roach76.checkOut(mr1, 5, "PayPal");
		PayPal npPP = new PayPal("Neiman@javamail.com", "123456");
		myLog.log(npPP.pay(coTotal));	
		coTotal = 0;
		
		MasterRoach newMasterRoach = new MasterRoach("7th Colony Inc.",  "7777-7777-7777-7770",  "007",  "June 2020");
		System.out.println("FINAL CHECKOUT LADS");
		System.out.println(Roach76);
		//rc1.party()
		myLog.log(RoachMotel.getInstance().toString());
    }
}