
public class Cylinder extends Luggage	{

	public Cylinder(double r, double h) {
		super((Math.PI * Math.pow(r, 2) * h), "Cylinder");
	}

	@Override
	public String toString()	{
//		return this.getType() + ", Volume: " + this.getVol() + ", Sides: 2";
		return super.toString() + ", Sides: 2";
	}
}
