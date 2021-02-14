import java.util.ArrayList;

public class ArrayListsLab {
	public static void main(String[] args) {
		ArrayList<String>  names = new ArrayList<String>();
		System.out.println(names);
		//Step A
		names.add("Alice");
		names.add("Bob");
		names.add("Connie");
		names.add("David");
		names.add("Edward");
		names.add("Fran");
		names.add("Gomez");
		names.add("Harry");
		System.out.println(names);
		//Step B/D
		System.out.println(names.get(0));
		System.out.println(names.get(names.size() - 1));
		//Step C
		System.out.println(names.size());
		//Step E
		names.set(0, "Alice B. Toklas");
		System.out.println(names);
		//Step F
		names.add(4, "Doug");
		System.out.println(names);
		//Step G
		//Old for Loop
//		for (int i = 0; i < names.size(); i++)	{
//			String name = names.get(i);
//			System.out.println(name);
//		}		
		//Enhanced for loop
		for (String name: names)	{
			System.out.println(name);
		}
				
		//Step H
		ArrayList<String> names2 = new ArrayList(names);
		System.out.println(names2);
		//Step I
		names.remove(0);
		System.out.println("names: " + names);
		System.out.println("names2: " + names2);
		
	}
}
