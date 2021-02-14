import java.util.*;

public class LinkedListRunner {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");
		list.add("fff");
		list.add("ggg");
		list.add("hhh");
		list.add("iii");
		
		ListIterator<String> iter = list.listIterator();		
		System.out.println("In forward order: ");
		while (iter.hasNext())	{
			System.out.print(iter.next() + " ");
		}
		
		while (iter.hasPrevious())	{
			String reverseTemp = iter.previous();
			char first = reverseTemp.charAt(0);
			if(first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u' )	{
				iter.remove();
			}
		}
		
		System.out.println("\n\nNow without vowels: ");
      	while (iter.hasNext())	{
			System.out.print(iter.next() + " ");
		}
	}
}
