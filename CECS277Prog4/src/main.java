import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//File name/location
//D:\Louis\Documents\GitEclipse\CECS277Prog4\src\rates.csv
//column num
//zip,	eiaid,	utility_name,	state,	service_type,	ownership,	comm_rate,	ind_rate,	res_rate
//0		1		2				3		4				5			6			7			8
public class main {
	public static void main(String[] args) throws FileNotFoundException	{
		Scanner in = new Scanner(System.in);
		String userIn;
		ArrayList<String> lines = new ArrayList<String>();
		ArrayList<String> commRates = new ArrayList<String>();
		
		System.out.print("Enter the file name: ");
		userIn = in.nextLine();
		System.out.println("Opening the file... " + userIn);
		File file = new File("D:\\Louis\\Documents\\GitEclipse\\CECS277Prog4\\src\\" + userIn);
		try {
			//Creates scanner
            Scanner myReader = new Scanner(file);
            //Skips over the header
            myReader.nextLine();
            
            //Reads all the lines and adds each line to an arraylist called lines
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                lines.add(data);
            }
            //End reading lines
            
            //Start retrieve comm rate avg
            double commRateAvg = 0;
            //Puts all the commission rates into an ArrayList
            for (String word : lines)	{
            	String temp[] = word.split(",");
            	commRates.add(temp[6]);
            }
            
            for (String str : commRates)	{
            	commRateAvg += Double.parseDouble(str);
            }
            
            commRateAvg = commRateAvg / commRates.size();
            //End retrieve comm rate
            
            //Start max comm rate
            double maxCommRate = 0;
            int highCommIndex = 0;
            int tempIndex = 0;
            String highestComm = "";
            for (String str : commRates)	{
            	double compare = Double.parseDouble(str);
            	//Compares to see max
            	//Handles ties by ignoring values of equal commission rate, therefore
            	//retaining the first zipcode 
            	if (compare > maxCommRate)	{
            		maxCommRate = compare;
            		highCommIndex = tempIndex;
            	}
            	tempIndex++;
            }
            //Get the information of the highest commission rate
            String maxTemp[] = lines.get(highCommIndex).split(",");
            //2,0,3,6 | the columns you need
            highestComm = maxTemp[2] + " (" + maxTemp[0] + ", " + maxTemp[3] + ") - $" + maxTemp[6];
            //End Max CommRate
            
            //Start least comm rate
            double leastCommRate = Double.parseDouble(commRates.get(0));
            int lowCommIndex = 0;
            tempIndex = 0;
            String lowestComm = "";
            for (String str : commRates)	{
            	double compare = Double.parseDouble(str);
            	//compares to see least
            	//Handles ties by ignoring values of equal commission rate, therefore
            	//retaining the first zipcode 
            	if (compare < leastCommRate)	{
            		leastCommRate = compare;
            		lowCommIndex = tempIndex;
            	}
            	tempIndex++;
            }
            //Get the information of the highest commission rate
            String leastTemp[] = lines.get(lowCommIndex).split(",");
            //2,0,3,6 | the columns you need
            lowestComm = leastTemp[2] + " (" + leastTemp[0] + ", " + leastTemp[3] + ") - $" + leastTemp[6];
            //End least comm rate
            
            myReader.close();
            System.out.println("Commission Rate Average: " + commRateAvg);
            System.out.println("Maximum Commission Information: " + highestComm);
            System.out.println("Minimum Commission Information: " + lowestComm);
        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}