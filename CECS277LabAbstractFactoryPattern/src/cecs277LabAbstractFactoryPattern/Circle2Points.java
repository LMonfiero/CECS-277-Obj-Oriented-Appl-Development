package cecs277LabAbstractFactoryPattern;

public class Circle2Points extends CircleAbstractClass{
	
	private Point [] corners;

	public Circle2Points (Point [] corners) throws InvalidShapeException {
		//super(corners);
		//Create a copy of the incoming points so that we don't have to worry about the client
		//moving our points around on us.
		this.corners = Point.clone(corners);
	} // End of Constructor
	
	@Override
	public Point[] getCorners() {
		//Make a copy of the four corners so that they cannot get tweaked.
		Point [] copy = Point.clone(this.corners);
		return copy;
	} // End of getCorners method
	
	@Override
	public double getRadius() {
		return (this.corners[1].distance(this.corners[0])/2);
	}

	@Override
	public Point getCenter() {
		return this.corners[0].between(this.corners[1]);
	}
}	
