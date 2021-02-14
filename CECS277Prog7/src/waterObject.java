import java.util.*;
//random.nextInt(max - min + 1) + min
abstract public class waterObject implements terraObject	{
	int impact;
	String type;
	public int getImpact()	{
		return impact;
	}
}

class river extends waterObject	{
	public river()	{
		Random imp = new Random();
		this.impact = imp.nextInt(60 - 10 + 1) + 1;
		this.type = "River";
	}
	
	@Override
	public terraObject add() {
		// TODO Auto-generated method stub
		return new river();
	}
	
	public String toString()	{
		return this.type + " Impact: " + this.impact;
	}
}

class lake extends waterObject	{
	public lake()	{
		Random imp = new Random();
		this.impact = imp.nextInt(50 - 40 + 1) + 1;
		this.type = "Lake";
	}

	@Override
	public terraObject add() {
		// TODO Auto-generated method stub
		return new lake();
	}
	
	public String toString()	{
		return this.type + " Impact: " + this.impact;
	}
	
}

class pond extends waterObject	{
	public pond()	{
		Random imp = new Random();
		this.impact = imp.nextInt(10 - 5 + 1) + 1;
		this.type = "Pond";
	}

	@Override
	public terraObject add() {
		// TODO Auto-generated method stub
		return new pond();
	}
	
	public String toString()	{
		return this.type + " Impact: " + this.impact;
	}
	
}

class ocean extends waterObject	{
	public ocean()	{
		Random imp = new Random();
		this.impact = imp.nextInt(100 - 50 + 1) + 1;
		this.type = "Ocean";
	}

	@Override
	public terraObject add() {
		// TODO Auto-generated method stub
		return new ocean();
	}
	
	public String toString()	{
		return this.type + " Impact: " + this.impact;
	}
	
}