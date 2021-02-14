import java.util.ArrayList;

public class GeometricRunner {
	public static void main(String[] args)	{
		ArrayList<GeometricObject> geoObjList = new ArrayList<GeometricObject>();
		Circle c1 = new Circle(2.0);
		Circle c2 = new Circle(5.0);
		Rectangle r1 = new Rectangle(1, 2);
		Rectangle r2 = new Rectangle(4, 5);
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle(3.0, 4.0, 5.0);
		c1.setName("Circle One");
		c2.setName("Circle Two");
		r1.setName("Rectangle One");
		r2.setName("Rectangle Two");
		t1.setName("Triangle One");
		t2.setName("Triangle Two");
		geoObjList.add(c1);
		geoObjList.add(c2);
		geoObjList.add(r1);
		geoObjList.add(r2);
		geoObjList.add(t1);
		geoObjList.add(t2);
		
		for (GeometricObject temp : geoObjList)	{
			System.out.println(temp.toString());
			System.out.println("Area: " + temp.getArea());
			System.out.println("Perimeter: " + temp.getPerimeter());
//			The method getDiameter() is undefined for the type GeometricObject
//			getDiameter is only defined in the circle class
//			System.out.println(temp.getDiameter());
			//Modification
			if (temp instanceof Circle)	{
				System.out.println("Diameter: " + ((Circle) temp).getDiameter());
			}
			System.out.println();
		}		
	}
}
