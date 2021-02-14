
// a concrete instance of an ice cream
public class Vanilla extends IceCream{
	public static final double COST = 1.25;

	public Vanilla(){
		description = "Creamy Vanilla";
	}

	public double cost() {
		return COST;
	}
}