//First of three personal shapes
// 2 * ((b^2 * h) / 3)
public class Octahedron extends Luggage		{

	public Octahedron(double b, double h) {
		super(2 * ((Math.pow(b, 2) * h) / 3), "Octahedron");
	}

	@Override
	public String toString()	{
//		return this.getType() + ", Volume: " + this.getVol() + ", Sides: 8";
		return super.toString() + ", Sides: 8";
	}
}
