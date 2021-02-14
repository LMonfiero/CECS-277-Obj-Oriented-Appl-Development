import java.util.*;
import java.io.*;

public class Part2 {
	public static void main(String[]args) throws FileNotFoundException, NumberFormatException	{
		TreeSet<String> treeset = readTreeAlice();
		hundredTree(treeset);
		HashSet<String> hashset = readHashAlice();
		hundredHash(hashset);
	}
	
	
	//Inserts Alice in Wonderland into a treeset
	private static TreeSet<String> readTreeAlice() throws FileNotFoundException	{
		TreeSet<String> treeset = new TreeSet<String>();
		File file = new File("D:\\Louis\\Documents\\GitEclipse\\CECS277Prog5\\src\\alice.txt");
		Scanner in = new Scanner(file);
		long start = System.nanoTime();
		while (in.hasNextLine())	{
			String key = in.next().toLowerCase();
			String word = key.replaceAll("[^a-zA-Z\\s]", "");
			treeset.add(word);
		}
		
		long end = System.nanoTime();
		System.out.println("\n**Inserting into a treeset time: " + (end-start) + " nanoseconds**");
		return treeset;
	}
	//Inserts Alice in Wonderland into hashset
	private static HashSet<String> readHashAlice() throws FileNotFoundException	{
		HashSet<String> hashset = new HashSet<String>();
		File file = new File("D:\\Louis\\Documents\\GitEclipse\\CECS277Prog5\\src\\alice.txt");
		Scanner in = new Scanner(file);
		long start = System.nanoTime();
		while (in.hasNextLine())	{
			String key = in.next().toLowerCase();
			String word = key.replaceAll("[^a-zA-Z\\s]", "");
			hashset.add(word);
		}
		
		long end = System.nanoTime();
		System.out.println("\n**Inserting into a hashset time: " + (end-start) + " nanoseconds**");
		return hashset;
	}
	
	private static void hundredTree(TreeSet<String> treeset)	{
		long start = System.nanoTime();
		Random rand = new Random();
		String hundredWords[] = new String[100];
		for (int i = 0; i < hundredWords.length; i++)	{
			//gets a random number from 0 to 100
			int randNum = rand.nextInt(100);
			int index = 0;
			//if randNum is equal to index, retrieve the word
			for (String word: treeset)	{
				if (index == randNum)	{
					hundredWords[randNum] = word;
					break;
				}
				//up the index by 1
				index++;
			}
		}
		long end = System.nanoTime();
		System.out.println("**Retrieve 100 words chosen randomly using treeset: " + (end-start) + " nanoseconds");
	}
	
	private static void hundredHash(HashSet<String> hashset)	{
		long start = System.nanoTime();
		Random rand = new Random();
		String hundredWords[] = new String[100];
		for (int i = 0; i < hundredWords.length; i++)	{
			//gets a random number from 0 to 100
			int randNum = rand.nextInt(100);
			int index = 0;
			//if randNum is equal to index, retrieve the word
			for (String word: hashset)	{
				if (index == randNum)	{
					hundredWords[randNum] = word;
					break;
				}
				//up the index by 1
				index++;
			}
		}
		long end = System.nanoTime();
		System.out.println("**Retrieve 100 words chosen randomly using hashset: " + (end-start) + " nanoseconds");
	}

}
