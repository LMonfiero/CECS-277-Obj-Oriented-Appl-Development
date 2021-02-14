import java.util.*;
//random.nextInt(max - min + 1) + min
abstract public class mineralObject implements terraObject	{
	int impact;
	String type;
	public int getImpact()	{
		return impact;
	}
}

class topsoil extends mineralObject	{
	public topsoil()	{
		Random imp = new Random();
		this.impact = imp.nextInt(35 - 15 + 1) + 1;
		this.type = "Top soil";
	}
	
	@Override
	public terraObject add() {
		// TODO Auto-generated method stub
		return new topsoil();
	}
	
	public String toString()	{
		return this.type + " Impact: " + this.impact;
	}
}

class coal extends mineralObject	{
	public coal()	{
		Random imp = new Random();
		this.impact = -1 * (imp.nextInt(100 - 70 + 1) + 1);
		this.type = "Coal";
	}

	@Override
	public terraObject add() {
		// TODO Auto-generated method stub
		return new coal();
	}
	
	public String toString()	{
		return this.type + " Impact: " + this.impact;
	}
	
}

class volcanicAsh extends mineralObject	{
	public volcanicAsh()	{
		Random imp = new Random();
		this.impact = imp.nextInt(60 - 30 + 1) + 1;
		this.type = "Volcanic Ash";
	}

	@Override
	public terraObject add() {
		// TODO Auto-generated method stub
		return new volcanicAsh();
	}
	
	public String toString()	{
		return this.type + " Impact: " + this.impact;
	}
	
}

class fluorite extends mineralObject	{
	public fluorite()	{
		Random imp = new Random();
		this.impact = -1 * (imp.nextInt(80 - 60 + 1) + 1);
		this.type = "Fluorite";
	}

	@Override
	public terraObject add() {
		// TODO Auto-generated method stub
		return new fluorite();
	}
	
	public String toString()	{
		return this.type + " Impact: " + this.impact;
	}
	
}