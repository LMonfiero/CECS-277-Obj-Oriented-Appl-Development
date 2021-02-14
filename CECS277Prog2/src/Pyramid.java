
public class Pyramid extends Luggage	{

	public Pyramid(double w, double l, double h) {
		super((w * l * h) / 3, "Pyramid");
	}

	@Override
	public String toString()	{
//		return this.getType() + ", Volume: " + this.getVol() + ", Sides: 4";
		return super.toString() + ", Sides: 4";
	}
}
