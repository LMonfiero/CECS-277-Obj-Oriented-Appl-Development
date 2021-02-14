import java.io.*;
import java.util.*;

public class main {
	public static void main(String[] args) throws FileNotFoundException	{
		
		
		File file = new File("D:\\Louis\\Documents\\GitEclipse\\CECS277FileIO\\src\\ziptables.txt");
		try {
            Scanner myReader = new Scanner(file);
            PrintWriter pw = null;
            pw = new PrintWriter("sample.txt");

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                pw.println(data);
            }
            myReader.close();
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }

}