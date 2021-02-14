import java.util.*;
import java.io.*;

public class Part3	{
	
	public static void main(String[] args) throws FileNotFoundException	{
//		ArrayList<String> words = readScrabble();
//		for (String temp : words)	{
//			System.out.println(temp);
//		}
//		
//		System.out.println("\n******Part 3: Insertion Comparison******");
//		TreeMap<String, Integer> treeMap = treeMapInsertion(words);
//		HashMap<String, Integer> hashMap = hashMapInsertion(words);
//		
//		System.out.println("\n******Part 2: Retrieval Comparison******");
//		
//		retrievalInTreeMap(treeMap);
//		retrievalInHashMap(hashMap);
		Scanner in = new Scanner(System.in);
		TreeMap<String, Integer> tree = readTreeAlice();
		long end, start;
		int entries = 0, points = 0;
		start = System.nanoTime();
		Iterator it1 = tree.entrySet().iterator();
	    while (it1.hasNext()) {
	        Map.Entry mp = (Map.Entry)it1.next();
//	        System.out.println(mp.getKey() + ": " + mp.getValue());
	        points += (Integer) mp.getValue();
	        entries++;
	    }
	    end = System.nanoTime();
		System.out.println("\n**Traversal for treemap time: " + (end-start) + " nanoseconds**");
		System.out.println("Entries total: " + entries + " || Points total: " + points);
		//Time for Hashmap's turn
	    System.out.println("Press any key to continue to hashmap...");
	    HashMap<String, Integer> hash = readHashAlice();
	    in.next();
	    entries = 0;
	    points = 0;
	    start = System.nanoTime();
		Iterator it2 = hash.entrySet().iterator();
	    while (it2.hasNext()) {
	        Map.Entry mp = (Map.Entry)it2.next();
//	        System.out.println(mp.getKey() + ": " + mp.getValue());
	        points += (Integer) mp.getValue();
	        entries++;
	    }
	    end = System.nanoTime();
		System.out.println("\n**Traversal for hashmap time: " + (end-start) + " nanoseconds**");
		System.out.println("Entries total: " + entries + " || Points total: " + points);
	    System.out.println("HashMap inserts faster than TreeMap, and prints faster than TreeMap");
	}
	

	//Inserts Alice in Wonderland into Treemap
	private static TreeMap<String, Integer> readTreeAlice() throws FileNotFoundException	{
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		File file = new File("D:\\Louis\\Documents\\GitEclipse\\CECS277Prog5\\src\\alice.txt");
		Scanner in = new Scanner(file);
		long start = System.nanoTime();
		while (in.hasNextLine())	{
			String key = in.next().toLowerCase();
			String word = key.replaceAll("[^a-zA-Z\\s]", "");
			map.put(word, getTreeScore(word));
		}
		
		long end = System.nanoTime();
		System.out.println("\n**Inserting into a treemap time: " + (end-start) + " nanoseconds**");
		return map;
	}
	//Inserts Alice in Wonderland into Hashmap
	private static HashMap<String, Integer> readHashAlice() throws FileNotFoundException	{
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		File file = new File("D:\\Louis\\Documents\\GitEclipse\\CECS277Prog5\\src\\alice.txt");
		Scanner in = new Scanner(file);
		long start = System.nanoTime();
		while (in.hasNextLine())	{
			String key = in.next().toLowerCase();
			String word = key.replaceAll("[^a-zA-Z\\s]", "");
			map.put(word, getTreeScore(word));
		}
		
		long end = System.nanoTime();
		System.out.println("\n**Inserting into a hashmap time: " + (end-start) + " nanoseconds**");
		return map;
	}
	//Calculates score via treemap
	private static int getTreeScore(String word) throws NumberFormatException, FileNotFoundException	{
		long start = System.nanoTime();
		TreeMap<Character, Integer> points = readTreePoints();
		int score = 0;
		for (char letter : word.toCharArray())	{
			score += points.get(letter);
		}
		long end = System.nanoTime();
//		System.out.println("\n**Calculating Score via Tree time: " + (end-start) + " nanoseconds**");
		return score;
	}
	//Calculates score via hashmap
	private static int getHashScore(String word) throws NumberFormatException, FileNotFoundException	{
		long start = System.nanoTime();
		HashMap<Character, Integer> points = readHashPoints();
		int score = 0;
		for (char letter : word.toCharArray())	{
			score += points.get(letter);
		}
		long end = System.nanoTime();
//		System.out.println("\n**Calculating Score via Hash time: " + (end-start) + " nanoseconds**");
		return score;
	}
	//Reads points file and inserts using treemap
	private static TreeMap<Character, Integer> readTreePoints() throws FileNotFoundException, NumberFormatException	{
		long start = System.nanoTime();
		File file = new File("D:\\Louis\\Documents\\GitEclipse\\CECS277Prog5\\src\\points.txt");
		Scanner in = new Scanner(file);
		TreeMap<Character, Integer> treemap = new TreeMap<Character, Integer>();
		while (in.hasNextLine())	{
			String line = in.nextLine();
			String split[] = line.split(",");
			int value = Integer.parseInt(split[0]);
				for (String character : split)	{
					if (character != split[0])	{						
						treemap.put(character.charAt(0), value);
					}
				}
		}
		long end = System.nanoTime();
//		System.out.println("\n**Reading points and inserting into a treemap time: " + (end-start) + " nanoseconds**");
		return treemap;
	}
	//Reads points file and inserts using hashmap
	private static HashMap<Character, Integer> readHashPoints() throws FileNotFoundException, NumberFormatException	{
		long start = System.nanoTime();
		File file = new File("D:\\Louis\\Documents\\GitEclipse\\CECS277Prog5\\src\\points.txt");
		Scanner in = new Scanner(file);
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		while (in.hasNextLine())	{
			String line = in.nextLine();
			String split[] = line.split(",");
			int value = Integer.parseInt(split[0]);
				for (String character : split)	{
					if (character != split[0])	{						
						hashmap.put(character.charAt(0), value);
					}
				}
		}
		long end = System.nanoTime();
//		System.out.println("\n**Reading points and inserting into a hashmap time: " + (end-start) + " nanoseconds**");
		return hashmap;
	}


}