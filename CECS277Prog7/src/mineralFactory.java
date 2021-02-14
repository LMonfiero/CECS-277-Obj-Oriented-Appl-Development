
public class mineralFactory extends AbstractFactory	 {
	public mineralObject getObject(int type)	{
		if (type == 0)	{
			return new topsoil();
		}
		
		else if (type == 1) {
			return new coal();
		}
		
		else if (type == 2)	{
			return new volcanicAsh();
		}
		
		else if (type == 3)	{
			return new fluorite();
		}
		
		return null;
	}
}
