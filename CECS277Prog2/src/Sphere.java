
public class Sphere extends Luggage		{

	public Sphere(double r) {
		super(((4/3) * Math.PI * (Math.pow(r, 3))), "Sphere");
	}

	@Override
	public String toString()	{
//		return this.getType() + ", Volume: " + this.getVol() + ", Sides: 1";
		return super.toString() + ", Sides: 1";
	}
}
