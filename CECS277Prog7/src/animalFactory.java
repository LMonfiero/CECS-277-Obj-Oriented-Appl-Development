
public class animalFactory extends AbstractFactory	{
	public animalObject getObject(int type)	{
		if (type == 0)	{
			return new mammal();
		}
		
		else if (type == 1) {
			return new fish();
		}
		
		else if (type == 2)	{
			return new birds();
		}
		
		else if (type == 3)	{
			return new reptiles();
		}
		
		return null;
	}
}
