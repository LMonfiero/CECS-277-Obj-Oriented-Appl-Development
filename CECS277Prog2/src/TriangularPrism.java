//Two of three personal shapes
// 1/2 * b * h * l
public class TriangularPrism extends Luggage	{

	public TriangularPrism(double b, double h, double l) {
		super((b * h * l) / 2, "Triangular Prism");
	}

	@Override
	public String toString()	{
//		return this.getType() + ", Volume: " + this.getVol() + ", Sides: 5";
		return super.toString() + ", Sides: 5";
	}
}
