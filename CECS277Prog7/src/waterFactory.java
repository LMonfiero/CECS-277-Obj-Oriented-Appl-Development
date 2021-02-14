
public class waterFactory extends AbstractFactory	 {
	public waterObject getObject(int type)	{
		if (type == 0)	{
			return new river();
		}
		
		else if (type == 1) {
			return new lake();
		}
		
		else if (type == 2)	{
			return new pond();
		}
		
		else if (type == 3)	{
			return new ocean();
		}
		
		return null;
	}
}
