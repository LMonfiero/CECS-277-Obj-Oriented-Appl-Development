
public class Person implements Measurable	{
	private String name;
	private int age;
	
	public Person(String mName, int mAge)	{
		name = mName;
		age = mAge;
	}
	
	public String getName()	{
		return name;
	}
	
	public int getAge()	{
		return age;
	}
	
	public double getMeasure()	{
		return (double) age;
	}

//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
}
