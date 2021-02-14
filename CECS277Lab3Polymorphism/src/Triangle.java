public class Triangle extends GeometricObject	{
	//Instance variables
	private double side1;
	private double side2;
	private double side3;
	
	//Default Constructor
	public Triangle()	{
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	//Constructor
	public Triangle(double x, double y, double z)	{
		side1 = x;
		side2 = y;
		side3 = z;
	}
	
	//GET METHODS
	
	//sqrt(s * (s - a) (s - b) (s - c))
	public double getArea()	{
		return Math.sqrt(getPerimeter()/2 * ((getPerimeter() - side1) * (getPerimeter() - side2) * (getPerimeter() - side3)));
	}
	
	public double getPerimeter()	{
		return side1 + side2 + side3;
	}
	
}
