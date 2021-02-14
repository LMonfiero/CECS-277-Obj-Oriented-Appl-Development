
public class HotFudge extends IceCreamDecorator {
	private static final double mCost = 0.60;
	private Dessert mFlavor;

public HotFudge(Dessert flavor) {
	mFlavor = flavor;
}

@Override
public String getDescription() {

	return mFlavor.getDescription() + " with Hot Fudge";
}

@Override
public double cost() {
	return mFlavor.cost() + mCost;
	}
}