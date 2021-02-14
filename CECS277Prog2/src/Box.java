
public class Box extends Luggage	{

	public Box(double w, double l, double h) {
		super((w * l * h), "Box");
	}
	
	@Override
	public String toString()	{
		//old way; Now I don't use getVolume lol
		//return this.getType() + ", Volume: " + this.getVol() + ", Sides: 6";
		return super.toString() + ", Sides: 6";
	}

}
