public class Rectangle extends GeometricObject	{
	//Instance variables
	private double width;
	private double height;
	
	//Constructor
	public Rectangle(double x, double y)	{
		width = x;
		height = y;
	}
	
	//GET METHODS
	
	public double getWidth()	{
		return width;
	}
	
	public double getHeight()	{
		return height;
	}
	
	public double getArea()	{
		return width * height;
	}
	
	public double getPerimeter()	{
		return 2 * width + 2 * height;
	}
	
	//SET METHODS
	
	public void setWidth(int x)	{
		width = x;
	}
	
	public void setHeight(int y)	{
		height = y;
	}	
}
