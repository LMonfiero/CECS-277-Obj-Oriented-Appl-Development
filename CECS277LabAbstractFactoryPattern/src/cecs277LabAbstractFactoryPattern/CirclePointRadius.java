package cecs277LabAbstractFactoryPattern;

public class CirclePointRadius extends CircleAbstractClass{
	private Point center;
	private double radius;
	
	public CirclePointRadius(Point[] points) throws InvalidShapeException {
		this.center = points[0];
		this.radius = points[1].distance(points[0]);
	}


	@Override
	public double getArea() {
		return Math.PI * this.radius * this.radius;

	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	@Override
	public double getRadius() {
		return this.radius;
	}

	@Override
	public Point getCenter() {
		return this.center;
	}

	// add sub radius value from the center, add radius value to get they opposite point
	
	@Override
	public Point[] getCorners() {
		Point [] copy = {  this.center, new Point (0, this.center.getX() + this.radius) };
		return copy;
	}
}
