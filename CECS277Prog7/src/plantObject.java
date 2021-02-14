import java.util.*;
//random.nextInt(max - min + 1) + min
abstract public class plantObject implements terraObject	{
	int impact;
	String type;
	public int getImpact()	{
		return impact;
	}
}

class flowers extends plantObject	{
	public flowers()	{
		Random imp = new Random();
		this.impact = imp.nextInt(10 - 5 + 1) + 1;
		this.type = "Flowers";
	}
	
	@Override
	public terraObject add() {
		// TODO Auto-generated method stub
		return new flowers();
	}
	
	public String toString()	{
		return this.type + " Impact: " + this.impact;
	}
}

class rainforest extends plantObject	{
	public rainforest()	{
		Random imp = new Random();
		this.impact = imp.nextInt(70 - 50 + 1) + 1;
		this.type = "Rainforest";
	}

	@Override
	public terraObject add() {
		// TODO Auto-generated method stub
		return new rainforest();
	}
	
	public String toString()	{
		return this.type + " Impact: " + this.impact;
	}
	
}

class woodlandForest extends plantObject	{
	public woodlandForest()	{
		Random imp = new Random();
		this.impact = imp.nextInt(80 - 40 + 1) + 1;
		this.type = "Woodland Forest";
	}

	@Override
	public terraObject add() {
		// TODO Auto-generated method stub
		return new woodlandForest();
	}
	
	public String toString()	{
		return this.type + " Impact: " + this.impact;
	}
	
}

class grasslands extends plantObject	{
	public grasslands()	{
		Random imp = new Random();
		this.impact = imp.nextInt(90 - 70 + 1) + 1;
		this.type = "Grasslands";
	}

	@Override
	public terraObject add() {
		// TODO Auto-generated method stub
		return new grasslands();
	}
	
	public String toString()	{
		return this.type + " Impact: " + this.impact;
	}
	
}