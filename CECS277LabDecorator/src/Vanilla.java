// a concrete instance of ice cream

public class Vanilla extends Dessert {
	public static final double COST = 1.25;
 
	public Vanilla() {
		description = "Sweet vanilla cream";
	}

	public double cost() {
		return COST;
 	}
 
}
