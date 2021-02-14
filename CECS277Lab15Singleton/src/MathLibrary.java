public class MathLibrary {
	private static MathLibrary mathInstance;
	
	private MathLibrary()	{}
	
	private int singleInt = 1;
	
	public synchronized static MathLibrary getMathLibrary()	{
		if (mathInstance == null)	{
			mathInstance = new MathLibrary();
		}
		return mathInstance;
	}
	
	public int someMathMethod() {
		singleInt = -1;
		return -1;
	}
	
	public double anotherMathMethod() {
		singleInt = 0;
		return 0;
	}
	
	public void display()	{
		System.out.println(singleInt);
	}
	
}

