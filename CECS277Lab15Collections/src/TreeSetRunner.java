import java.util.*;

public class TreeSetRunner {
	public static void main(String[] args)	{
		TreeSet<String> myTree = new TreeSet<String>();
		myTree.add("iii");
		myTree.add("hhh");
		myTree.add("ggg");
		myTree.add("fff");
		myTree.add("eee");
		myTree.add("ddd");
		myTree.add("ccc");
		myTree.add("bbb");
		myTree.add("aaa");
		myTree.add("iii");
		myTree.add("hhh");
		myTree.add("ggg");
		myTree.add("fff");
		myTree.add("eee");
		myTree.add("ddd");
		myTree.add("ccc");
		myTree.add("bbb");
		myTree.add("aaa");
		
		for (String str : myTree)	{
			System.out.print(str + " | ");
			//Strings appear only one time in the tree set
			//String implements Comparable interface so it sorts it alphabetically for you automatically when it's 
			//inserted into the TreeSet
		}
		
	}
}
