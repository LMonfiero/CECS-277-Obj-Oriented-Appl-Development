package cecs277LabAbstractFactoryPattern;

public abstract class CircleAbstractClass extends GeometricShape {
	
	static final double pi = Math.PI;
	
	public abstract double getRadius();
	
	public abstract Point getCenter();
	
	public abstract Point [] getCorners ();
	
	@Override
	public Point [] getPoints () { return this.getCorners(); } 
	
	@Override
	public double getArea () {return Math.abs(Math.pow(this.getRadius(), 2) * pi);}

	/**
	 * Calculate the perimeter of the rectangle.
	 * @return	The perimeter of the rectangle
	 */
	@Override
	public double getPerimeter () {return (Math.abs(this.getRadius()) * pi * 2); }
	
	@Override
	public Point getLocation () {return this.getCenter(); }
	
	@Override
	public String toString () {
		StringBuilder sb = new StringBuilder("Circle- Two Points : ");
		Point [] corners = this.getCorners();
		for (int i = 0; i < corners.length; i++) {
			sb.append(corners[i].toString() + " ");
		}
		sb.append("\nArea: " + this.getArea() + " Perimeter: " + this.getPerimeter());
		sb.append("\nRadius: " + this.getRadius());
		return sb.toString();
	}
	
}