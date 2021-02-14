package cecs277IOException;



import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;


public class LabIOException {
	/*
	 * Read the next two double precision numbers from the scanner that we get,
	 * and make them into a Point instance.  Check to see that we can get both
	 * the x and the y coordinates from the scanner.  Throw a IllegalArgumentException
	 * if you cannot get two double precision numbers out of the scanner.
	 * @param	line	The scanner that has the current line of input.  The caller
	 * 					reads in a line of text from the input file, then creates a
	 * 					scanner on that line of text, all by itself.  Not the whole file.
	 * 					Then passes that scanner to this routine to get two double
	 * 					precision values.
	 * @return			A new instance of Point.
	 */
	public static Point getNextPoint (Scanner line) {
		//There may be no more double precision numbers left, just one or two.
		//Throw the IllegalArgumentException if you have < 2 double precision numbers
		//left in the scanner.
		double x = 0;
		double y = 0;
		Point p;
		try 
		{
			x = line.nextDouble();
			y = line.nextDouble();
		}
		catch (IllegalArgumentException iae) 
		{
			System.out.println("No numbers left");
		}
		
		p = new Point(x,y);
		return p;

	}
	
	/**
	 * Find the area of the triangle, given the verticies that the user passes in.
	 * @param vertices	An array of three Points that are the corners of the triangle.
	 * 					The order is unimportant.  Note that this does not check to
	 * 					make sure that there are exactly three.
	 * @return			The area of the triangle, using Heron's formula.
	 */
	public static double area (Point [] vertices) {
		double side1, side2, side3;
		//Find the length of each of the sides of the triangle
		side1 = vertices[0].distance(vertices[1]);
		side2 = vertices[1].distance(vertices[2]);
		side3 = vertices[2].distance(vertices[0]);
		//s is an intermediate value needed by Heron's formula
		double s =	(side1 + side2 + side3)/2.0;
		return Math.sqrt(s*(s - side1) * (s - side2) * (s - side3));
	}

	public static void main(String[] args) {
		JFileChooser chooser = new JFileChooser();
		Scanner in = new Scanner(System.in);
		String fNameStr = "";
		File inFile = null;
		boolean foundInFile = false;			//Flag that we don't have an input file.
		do {
			try	
			{			
			System.out.println("Enter full input file Path. ");
			fNameStr = in.nextLine();
			inFile = new File(fNameStr);
			in = new Scanner(inFile);
			foundInFile = true;
			} catch (FileNotFoundException fnf) {
				System.out.println("Error. Input file not found.");
			} 
			
		} while (!foundInFile);
		
		
		boolean foundOutFile = false;			//Flag that we don't have an outpout file
		PrintWriter out = null;				//Output file
		do {
			try	
			{
				System.out.println("Enter full output file Path. ");
				Scanner sOut = new Scanner(System.in);
				String pwStr = sOut.nextLine();
				File outFile = new File(pwStr);
				chooser.setSelectedFile(outFile);
				out = new PrintWriter(chooser.getSelectedFile().getAbsolutePath());
				foundOutFile = true;
				sOut.close();
			}
			 catch (FileNotFoundException fnf) 
			{
				System.out.println("Error. Output file not found.");
			}
			
		} while (!foundOutFile);
		
		String line;					//The current line of the ASCII text file
		Point vertices [] = new Point [3];		//The array of triangle vertices 
		//in = new Scanner(inFile);
		//in = fScan;
		while (in.hasNextLine()) {
			line = in.nextLine();
			System.out.println("Line: " + line);
			Scanner thisLine = new Scanner (line);
			boolean success = false;
			for (int i = 0; i < 3; i++) {
				//Use getNextPoint to read the next point from the thisLine scanner.
				//Once you have all three points read in, set success to be true.
				vertices[i] = getNextPoint(thisLine);
				success = true;
			} // End of reading in the vertices
			if (success) {				//Output the area to the output file.
				out.println("Next area: " + area(vertices));
			}
		}
		in.close();
		out.close();
		System.out.println("Completed satisfactorily.");
	}

}
