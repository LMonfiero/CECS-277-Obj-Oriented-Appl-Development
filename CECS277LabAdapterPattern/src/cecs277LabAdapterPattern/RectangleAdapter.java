package cecs277LabAdapterPattern;

import java.util.*;

public class RectangleAdapter implements OldRectangle	{
	
	NewRectangle newRectangle;
	
	Point upperLeft;
	
	double width;
	
	double length;
	
	public RectangleAdapter(NewRectangle newRectangle)	{
		this.newRectangle = newRectangle;
	}

	@Override
	public double getArea() {
		return newRectangle.getArea();
	}

	@Override
	public double getPerimeter() {
		return newRectangle.getPerimeter();
	}

	@Override
	public double getDiagonal() {
		double oldWidth = newRectangle.getWidth();
		double oldLength = newRectangle.getLength();
		double pythags = (oldWidth * oldWidth) + (oldLength * oldLength);
		return Math.sqrt(pythags);
	}

	@Override
	public Point[] getCorners() {
		Point upLeft = newRectangle.getUpperLeft();
		double upX = upLeft.getX();
		double upY = upLeft.getY();
		double oldWidth = newRectangle.getWidth();
		double oldLength = newRectangle.getLength();
		Point upRight = new Point((upX + oldWidth), upY);
		Point downLeft = new Point(upX, (upY + oldLength));
		Point downRight = new Point ((upX + oldWidth), (upY + oldLength));
		Point[] cornerPoints = new Point[]	{upLeft, upRight, downLeft, downRight};
		return cornerPoints;
	}

}
