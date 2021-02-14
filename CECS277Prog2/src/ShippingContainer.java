import java.text.DecimalFormat;
import java.util.*;

public class ShippingContainer {

	private static ArrayList<Luggage> luggageList;
	
	public ShippingContainer()	{
		luggageList = new ArrayList<Luggage>();
		Box lugOne = new Box(2.5, 4, 5.3);
		Sphere lugTwo = new Sphere(6);
		Cube lugThree = new Cube(7);
		Pyramid lugFour = new Pyramid(3, 2, 1);
		Cylinder lugFive = new Cylinder(6, 2);
		Octahedron lugSix = new Octahedron(4, 1.7);
		TriangularPrism lugSeven = new TriangularPrism(3, 5, 7);
		Cone lugEight = new Cone(15, 1.1);
		Cube lugNine = new Cube(2.5);
		Box lugTen = new Box(2.9, 5.3, 1.5);
		luggageList.add(lugOne);
		luggageList.add(lugTwo);
		luggageList.add(lugThree);
		luggageList.add(lugFour);
		luggageList.add(lugFive);
		luggageList.add(lugSix);
		luggageList.add(lugSeven);
		luggageList.add(lugEight);
		luggageList.add(lugNine);
		luggageList.add(lugTen);
		Collections.sort(luggageList);
	}
	
	public static void addLuggage(Luggage lug)	{
		luggageList.add(lug);
		Collections.sort(luggageList);
	}
	
	public void removeLuggage(int i)	{
		luggageList.remove(i - 1);
	}
	
	public void displayRem()	{
		int i = 1;
		for (Luggage lug : luggageList) {
			System.out.println(i + ": " + lug.toString());
			i++;
		}
	}
	
	public void display()	{
		double sumVol = 0;
		for (Luggage lug : luggageList) {
			System.out.println(lug.toString());
			sumVol += lug.getVol();
		}
		DecimalFormat df = new DecimalFormat("#.##");		
		System.out.println("Total Luggage: " + luggageList.size() + " and Total Volume: " + df.format(sumVol));
	}
	
}
