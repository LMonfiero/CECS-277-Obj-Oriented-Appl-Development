import java.util.*;

public class main {
	public static void main(String[] args)	{
		planet mPlanet;
		mPlanet = createAWorld();
		boolean loop = true;
		while (loop)	{
			
			int choice = getMenu(mPlanet);
			
			if (choice == 1)	{
				mPlanet.allWater();
			}
			
			else if (choice == 2)	{
				mPlanet.allPlants();
			}
			
			else if (choice == 3)	{
				mPlanet.allMinerals();
			}
			
			else if (choice == 4)	{
				mPlanet.allAnimals();
			}
			
			else if (choice == 5)	{
				loop = false;
			}
			System.out.println("\n");
		}
	}
	
	public static int getMenu(planet mPlanet)	{
		System.out.println(mPlanet);
		System.out.println("TerraForming Menu:");
		System.out.println("1) List all water objects");
		System.out.println("2) List all plant objects");
		System.out.println("3) List all mineral objects");
		System.out.println("4) List all animal objects");
		System.out.println("5) Exit Program");
		int i;
		do	{
			Scanner in = new Scanner(System.in);
			i = in.nextInt();		
		} while (i < 1 & i > 5);
		return i;
	}
	
	public static planet createAWorld()	{
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the Terraforming Program!");
		System.out.println("Enter the name of your new planet: ");
		String name = in.nextLine();
		System.out.println("Enter the size of " + name);
		System.out.println("1) Small");
		System.out.println("2) Medium");
		System.out.println("3) Large");
		System.out.println("4) Extra Large");
		int size = in.nextInt();
		while (size < 1 & size > 4) {
			System.out.println("Invalid choice. Try again.");
			size = in.nextInt();
		}
		
		String sz = "";
		switch (size)	{
		case 1:
			sz = "Small";
			break;
		case 2:
			sz = "Medium";
			break;
		case 3:
			sz = "Large";
			break;
		case 4:
			sz = "Extra Large";
			break;
		}
		
		System.out.println("How would you like to distribute the categories? (Use percentage)");
		int percentage = 100;
		int water, mineral, animal, plant;
		System.out.println("Percentage Remaining: " + percentage);
		System.out.println("Enter water percentage: ");
		water = getPercentage(percentage);
		percentage -= water;
		
		System.out.println("Percentage Remaining: " + percentage);
		System.out.println("Enter plant percentage: ");
		plant = getPercentage(percentage);
		percentage -= plant;
		
		System.out.println("Percentage Remaining: " + percentage);
		System.out.println("Enter mineral percentage: ");
		mineral = getPercentage(percentage);
		percentage -= mineral;
		
		System.out.println("Percentage Remaining: " + percentage);
		System.out.println("Enter animal percentage: ");
		animal = getPercentage(percentage);
		percentage -= animal;
		
		System.out.println("You chose the following:");
		System.out.println("Planet Size: " + sz);
		System.out.println("Terra Object distribution: ");
		System.out.println("Water: " + water + "%");
		System.out.println("Plant: " + plant + "%");
		System.out.println("Mineral: " + mineral + "%");
		System.out.println("Animal: " + animal + "%");
		System.out.println("Enter yes to continue with these choices and no to return to the menu.");
		String yesno;
		in.nextLine();
		yesno = in.nextLine();
		if (yesno.equalsIgnoreCase("no"))	{
			System.out.println("Exiting program...");
			return null;
		}
		
		System.out.println("Continuing with creation of the planet.");
		return new planet(size, name, water, mineral, animal, plant);
	}
	
	public static int getPercentage(int percent)	{
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		while (i > percent) {
			System.out.println("Failure. Needs to be equal or less than the percentage");
			i = in.nextInt();
		}
		
		return i;
	}
}
