import java.util.*;

public class main {
	public static int menu()	{
		Scanner in = new Scanner(System.in);
		System.out.println("\nLuggage Menu:");
		System.out.println("1. Create new Shipping Container with 10 preset luggage items of your choice");
		System.out.println("2. Add Luggage to Shipping Container");
		System.out.println("3. Remove Luggage from Shipping Container");
		System.out.println("4. Show All Luggage in the Shipping Container");
		System.out.println("5. Exit");
		System.out.print("User Input: ");
		int userInput = in.nextInt();
		return userInput;
	 }
	
	public static int addLuggDisplay()	{
		Scanner in = new Scanner(System.in);
		System.out.println("Choose your type of luggage: ");
		System.out.println("1. Box (width, length, height)");
		System.out.println("2. Sphere (radius)");
		System.out.println("3. Cube (length)");
		System.out.println("4. Pyramid (width, length, height)");
		System.out.println("5. Cylinder (radius, height)");
		System.out.println("6. Octahedron (base, height)");
		System.out.println("7. Triangular Prism (base, height, length)");
		System.out.println("8. Cone (radius, height)");
		System.out.println("User Input: ");
		int addInput = in.nextInt();
		return addInput;
	}
	
	public static void main(String args[])	{
		boolean keepGoing = true;
		ShippingContainer myContainer = null;
		Scanner in = new Scanner(System.in);		
		//Start while loop
		Box hehe = new Box(2, 3, 4);
		boolean notEmpty = false;
		
		do	{
			int userInput = menu();
			
           //new Shipping Container
            if (userInput == 1)	{
            	myContainer = new ShippingContainer();
            	System.out.println("New Shipping Container created.\n");
            	notEmpty = true;
            }	//end new ship cont
           
           //Add Luggage
            else if (userInput == 2 & notEmpty)	{
        		int addInput = addLuggDisplay();
        		double a, b, c;
        		Luggage temp;
        		//Box
        		if (addInput == 1)	{
        			System.out.println("Enter width: ");
        			a = in.nextInt();
        			System.out.println("Enter length: ");
        			b = in.nextInt();
        			System.out.println("Enter height: ");
        			c = in.nextInt();
        			System.out.println("Box successfully added to Shipping Container");
        			temp = new Box(a, b, c);
        			myContainer.addLuggage(temp);
        		}
        		
        		//Sphere
        		else if (addInput == 2)	{
        			System.out.println("Enter radius: ");
        			a = in.nextInt();
        			System.out.println("Sphere successfully added to Shipping Container");
        			temp = new Sphere(a);
        			myContainer.addLuggage(temp);
        		}
        		
        		//Cube
        		else if (addInput == 3)	{
        			System.out.println("Enter length: ");
        			a = in.nextInt();
        			System.out.println("Cube successfully added to Shipping Container");
        			temp = new Cube(a);
        			myContainer.addLuggage(temp);
        		}
        		
        		//Pyramid
        		else if (addInput == 4)	{
        			System.out.println("Enter width: ");
        			a = in.nextInt();
        			System.out.println("Enter length: ");
        			b = in.nextInt();
        			System.out.println("Enter height: ");
        			c = in.nextInt();
        			System.out.println("Pyramid successfully added to Shipping Container");
        			temp = new Pyramid(a, b, c);
        			myContainer.addLuggage(temp);
        		}
        		
        		//Cylinder
        		else if (addInput == 5)	{
        			System.out.println("Enter radius: ");
        			a = in.nextInt();
        			System.out.println("Enter height: ");
        			b = in.nextInt();
        			System.out.println("Cylinder successfully added to Shipping Container");
        			temp = new Cylinder(a, b);
        			myContainer.addLuggage(temp);
        		}
        		
        		//Octahedron
        		else if (addInput == 6)	{
        			System.out.println("Enter base: ");
        			a = in.nextInt();
        			System.out.println("Enter height: ");
        			b = in.nextInt();
        			System.out.println("Octahedron successfully added to Shipping Container");
        			temp = new Octahedron(a, b);
        			myContainer.addLuggage(temp);
        		}
        		
        		//Triangular Prism
        		else if (addInput == 7)	{
        			System.out.println("Enter base: ");
        			a = in.nextInt();
        			System.out.println("Enter height: ");
        			b = in.nextInt();
        			System.out.println("Enter length: ");
        			c = in.nextInt();
        			System.out.println("Triangular Prism successfully added to Shipping Container");
        			temp = new TriangularPrism(a, b, c);
        			myContainer.addLuggage(temp);
        		}
        		
        		//Cone
        		else if (addInput == 8)	{
        			System.out.println("Enter radius: ");
        			a = in.nextInt();
        			System.out.println("Enter height: ");
        			b = in.nextInt();
        			System.out.println("Cone successfully added to Shipping Container");
        			temp = new Cone(a, b);
        			myContainer.addLuggage(temp);
        		}
        		
        		else {
        			System.out.println("Invalid Input. Returning to main menu.");
        		}
        		
            }//end add luggage
           
           //Remove Luggage
            else if (userInput == 3 & notEmpty)	{
            	myContainer.displayRem();
            	System.out.println("Choose what to remove: ");
            	int removeIndex = in.nextInt();
            	myContainer.removeLuggage(removeIndex);
            	
            }//end remove
           
           //Display Luggage
            else if (userInput == 4 & notEmpty)	{
            	myContainer.display();
            }//end display
           
           //Exit
           else if (userInput == 5)	{
        	   break;
           }//end exit
           
           else	{
           		if (!notEmpty)	{
           			System.out.println("You need to create a shipping container first.");
           		}
           		else	{
           			System.out.println("Invalid User Input. Enter a valid option.");
           		}
           }
           
		 }	while (keepGoing);
	}//end main()
	
}
