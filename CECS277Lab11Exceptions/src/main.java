import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class main {

    public static void main(String[] args) {
    	String input;
        String output;
        for (String temp : args)	{
        	System.out.println(temp);
        }
    	
    	if (args.length != 2)	{
    		System.out.println("Need exactly 2 arguments.");
    	}
    	
    	else	{
//    		input = args[0] + ".txt";
//    		output = args[1] + ".txt";
    		input = args[0];
    		output = args[1];
    
    		try {

                // Open input files
                Scanner in = new Scanner(new File("D:\\Louis\\Documents\\GitEclipse\\CECS277FileIO\\src\\" + input)); //ziptables is the correct file name
                // Open output files
                // Read lines from each file
                PrintWriter out =  new PrintWriter(output);
                while (in.hasNextLine()) {
                    String zcode = in.nextLine();
                    out.println(zcode);
                }

                in.close();
                out.close();
                System.out.println("Read/Write completed succesfully. Closing program...");
            }
            catch(FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("An error occured. The file '" + input + "' was not found.");
            }
    	}
    }
}