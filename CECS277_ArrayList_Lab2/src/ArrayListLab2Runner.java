import java.util.*;

public class ArrayListLab2Runner {
	public static void main(String args[])	{
		ArrayList<String> uniqueWords = new ArrayList<String>();
		ArrayList<String> duplicateWords = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		String str;
		
		do	{
			System.out.print("Input: " );
			str = in.next();
			if (str.equals("end"))	{
				break;
			}
			
			else if (!uniqueWords.contains(str))	{
				uniqueWords.add(str);
			}
			else	{
				duplicateWords.add(str);
			}
			
		}	while (!str.equals("end"));
		
		for (int i = 0; i < uniqueWords.size(); i++)	{
			for (int j = 0; j < duplicateWords.size(); j++)	{
				if (!uniqueWords.isEmpty())	{
					if (uniqueWords.get(i).equals(duplicateWords.get(j)))	{
						duplicateWords.add(uniqueWords.get(i));
						uniqueWords.remove(i);
					}
				}
			}
		}
		
		if (str != "end");
		
		Collections.sort(uniqueWords,  String.CASE_INSENSITIVE_ORDER);
		System.out.println("List of Unique Words: " + uniqueWords);
		System.out.println("List of Duplicate Words: " + duplicateWords);
		System.out.println("Done!");
	
	}
	
}