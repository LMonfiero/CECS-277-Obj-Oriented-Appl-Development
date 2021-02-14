import java.awt.Rectangle;

public class BetterRectangle extends Rectangle	{
	//Constructor
	public BetterRectangle(int x, int y, int width, int height)	{
		super(x, y, width, height);
	}
	
	//w and h don't work??? used width and height
	public int getPerimeter()	{
//		return 2 * x + 2 * y;
		return x + y + width + height;
	}
	
	public int getArea()	{
		return x * y;
	}
}
