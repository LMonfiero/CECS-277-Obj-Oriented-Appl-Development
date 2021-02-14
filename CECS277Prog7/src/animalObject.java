import java.util.Random;
//random.nextInt(max - min + 1) + min
abstract public class animalObject implements terraObject	{
	int impact;
	String type;
	public int getImpact()	{
		return impact;
	}
}

class mammal extends animalObject	{
	public mammal()	{
		Random imp = new Random();
		this.impact = -1 * (imp.nextInt(100 - 40 + 1) + 1);
		this.type = "Mammal";
	}
	
	@Override
	public terraObject add() {
		// TODO Auto-generated method stub
		return new mammal();
	}
	
	public String toString()	{
		return this.type + " Impact: " + this.impact;
	}
}

class fish extends animalObject	{
	public fish()	{
		Random imp = new Random();
		this.impact = -1 * (imp.nextInt(40 - 15 + 1) + 1);
		this.type = "Fish";
	}

	@Override
	public terraObject add() {
		// TODO Auto-generated method stub
		return new fish();
	}
	
	public String toString()	{
		return this.type + " Impact: " + this.impact;
	}
	
}

class birds extends animalObject	{
	public birds()	{
		Random imp = new Random();
		this.impact = -1 * (imp.nextInt(10 - 0 + 1) + 1);
		this.type = "Birds";
	}

	@Override
	public birds add() {
		// TODO Auto-generated method stub
		return new birds();
	}
	
	public String toString()	{
		return this.type + " Impact: " + this.impact;
	}
	
}

class reptiles extends animalObject	{
	public reptiles()	{
		Random imp = new Random();
		this.impact = -1 * (imp.nextInt(60 - 20 + 1) + 1);
		this.type = "Reptiles";
	}

	@Override
	public terraObject add() {
		// TODO Auto-generated method stub
		return new reptiles();
	}
	
	public String toString()	{
		return this.type + " Impact: " + this.impact;
	}
	
}