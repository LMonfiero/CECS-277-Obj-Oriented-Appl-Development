
public class plantFactory extends AbstractFactory	{
	public plantObject getObject(int type)	{
		if (type == 0)	{
			return new flowers();
		}
		
		else if (type == 1) {
			return new rainforest();
		}
		
		else if (type == 2)	{
			return new woodlandForest();
		}
		
		else if (type == 3)	{
			return new grasslands();
		}
		
		return null;
	}
}