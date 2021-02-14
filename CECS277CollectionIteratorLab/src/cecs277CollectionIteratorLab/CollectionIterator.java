package cecs277CollectionIteratorLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class CollectionIterator {
    public static void main(String[]args)
    {
        File file = new File("Pride and Prejudice.txt");
        try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8.name())){
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    
    }
    
}
