//Three of three personal shapes
// 1/3 * pi * r^2 * h
public class Cone extends Luggage	{

	public Cone(double r, double h) {
		super((Math.PI * Math.pow(r, 2) * h)/3, "Cone");
	}

	@Override
	public String toString()	{
//		return this.getType() + ", Volume: " + this.getVol() + ", Sides: 2";
		return super.toString() + ", Sides: 2";
	}
}
