import java.util.*;
import java.io.*;

public class Part1 {
	public static void main(String[]args) throws FileNotFoundException, NumberFormatException	{
		Scanner in = new Scanner(System.in);
		TreeMap<String, Integer> wordsTree = readTreeScrabble();
		long end, start;
		start = System.nanoTime();
		Iterator it1 = wordsTree.entrySet().iterator();
	    while (it1.hasNext()) {
	        Map.Entry mp = (Map.Entry)it1.next();
	        System.out.println(mp.getKey() + ": " + mp.getValue());
	    }
	    end = System.nanoTime();
		System.out.println("\n**Printing words from a treemap time: " + (end-start) + " nanoseconds**");
		
	    System.out.println("Press any key to continue to hashmap...");
	    in.next();
	    HashMap<String, Integer> wordsHash = readHashScrabble();
	    start = System.nanoTime();
		Iterator it2 = wordsHash.entrySet().iterator();
	    while (it2.hasNext()) {
	        Map.Entry mp = (Map.Entry)it2.next();
	        System.out.println(mp.getKey() + ": " + mp.getValue());
	    }
	    end = System.nanoTime();
		System.out.println("\n**Printing words from a hashmap time: " + (end-start) + " nanoseconds**");
	    
	    System.out.println("HashMap displays faster than TreeMap, but inserts slower than TreeMap");
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
	//Reads scrabble file and inserts using treemap
	private static TreeMap<String, Integer> readTreeScrabble() throws FileNotFoundException	{
		long start = System.nanoTime();
		TreeMap<String, Integer> treemap = new TreeMap<String, Integer>();
		File file = new File("D:\\Louis\\Documents\\GitEclipse\\CECS277Prog5\\src\\scrab.txt");
		Scanner in = new Scanner(file);
		while (in.hasNextLine())	{
			String key = in.nextLine();
			treemap.put(key, getTreeScore(key));
		}
		
		long end = System.nanoTime();
		System.out.println("\n**Reading words and inserting into a treemap time: " + (end-start) + " nanoseconds**");
		return treemap;
	}
	//Reads scrabble file and inserts using hashmap
	private static HashMap<String, Integer> readHashScrabble() throws FileNotFoundException	{
		long start = System.nanoTime();
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		File file = new File("D:\\Louis\\Documents\\GitEclipse\\CECS277Prog5\\src\\scrab.txt");
		Scanner in = new Scanner(file);
		while (in.hasNextLine())	{
			String key = in.nextLine();
			hashmap.put(key, getHashScore(key));
		}
		
		long end = System.nanoTime();
		System.out.println("\n**Reading words and inserting into a hashmap time: " + (end-start) + " nanoseconds**");
		return hashmap;
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
