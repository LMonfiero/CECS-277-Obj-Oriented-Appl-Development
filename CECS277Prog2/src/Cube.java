
public class Cube extends Luggage	{

	public Cube(double a) {
		super(Math.pow(a, 3), "Cube");
	}

	@Override
	public String toString()	{
//		return this.getType() + ", Volume: " + this.getVol() + ", Sides: 6";
		return super.toString() + ", Sides: 6";
	}
}
