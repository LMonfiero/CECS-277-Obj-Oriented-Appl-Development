package Labs.Lab1_ArrayList;

import java.util.ArrayList;

public class ArrayListRunner {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    System.out.println(names);
    names.add("Alice");
    names.add("Bob");
    names.add("Connie");
    names.add("David");
    names.add("Edward");
    names.add("Fran");
    names.add("Gomez");
    names.add("Harry");
    System.out.println(names);
    
    int arraySize = names.size();
    System.out.println(arraySize);
    
    String firstName = names.get(0);
    String lastName = names.get(arraySize - 1);
    
    System.out.println(firstName);
    System.out.println(lastName);
    
    int findAlice = names.indexOf("Alice");
    names.set(findAlice, "Alice B. Tulkas");
    System.out.println(names);
    
    int afterDavid = names.indexOf("David");
    names.add(afterDavid + 1, "Doug"); //+1 to place it after David
    System.out.println(names);
    arraySize = names.size(); //Updates size because of Doug
    
    ArrayList<String> names2 = new ArrayList<String>();
    for (int i = 0; i < arraySize; i++) {
    	names2.add(names.get(i));
    } //finishes for loop
    		
    names.remove(0);
    System.out.println(names);
    System.out.println(names2);
  }// ends main
}//ends class
