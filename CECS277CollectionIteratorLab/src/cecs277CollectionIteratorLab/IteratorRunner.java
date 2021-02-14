package cecs277CollectionIteratorLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class IteratorRunner {
    
    public static void main(String[]args)
    {
        Scanner sc = null;
        try{
            sc = new Scanner (new File("D:\\Louis\\Documents\\GitEclipse\\CECS277CollectionIteratorLab\\src\\cecs277CollectionIteratorLab\\Pride and Prejudice.txt"));
        }
        
        catch (IOException e){
            e.printStackTrace();
        }
        
        Map<String, Integer> list = new HashMap<>();
        while (sc.hasNextLine()) {
            String line = sc.next().toLowerCase().replaceAll("[^a-z]","");
            //System.out.println(line);
            
            if (list.containsKey(line))	{
            	list.replace(line, list.get(line) + 1);
            }
            else {
            	list.put(line, 1);
            }
            //list.put(line, 1);
        }
        SortedSet<String> keys = new TreeSet<>(list.keySet());
        for (String key : keys)
        {
        	System.out.println(key + " - " + list.get(key));
        	System.out.println();
        }
    
    }
    
}


