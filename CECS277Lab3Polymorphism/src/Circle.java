public class Circle extends GeometricObject	{
	
	//Instance variables
	//Using double cause we use PI
	private double radius;
	
	//Constructor
	public Circle(double r)	{
		radius = r;
	}
	
	//GET METHODS
	
	public double getRadius()	{
		return radius;
	}
	
	public double getArea()	{
		return  radius * Math.pow(Math.PI, 2);
	}
	
	public double getPerimeter()	{
		return 2 * radius * Math.PI;
	}
	
	public double getDiameter()	{
		return 2 * radius;
	}
	
	//SET METHODS
	
	public void setRadius(double r)	{
		radius = r;
	}
	
}
