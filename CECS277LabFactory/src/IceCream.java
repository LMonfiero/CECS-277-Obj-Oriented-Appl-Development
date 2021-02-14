
/**
* This acts as the product the factory constructs.
*/

public abstract class IceCream extends Dessert {
	protected String description;

// returns the description of the ice cream
	public String getDescription() {
		return description;
	}

	public void scoop() {
		System.out.println("Scooping some " + description);
	}

	public void eat() {
		System.out.println("Enjoying some " + description);
	}

	// returns the cost of the ice cream
	public abstract double cost();
	}