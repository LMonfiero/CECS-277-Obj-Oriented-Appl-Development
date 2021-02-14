import java.util.*;

public class main {
	
	 public static boolean isPrime(int sum)	{
		if 		(sum <= 1)				{	return false;	}
 		else if (sum == 1)				{	return false;	}
		//For loop
 		for (int i = 2; i < sum; i++)	{
 			if (sum % i == 0)			{	return false;	}
 		}//end for
		return true;
	 }
	 
	 public static int menu()	{
		Scanner in = new Scanner(System.in);
		System.out.println("\nSolitaire Prime Menu:");
		System.out.println("1. New Deck");
		System.out.println("2. Display Deck");
		System.out.println("3. Shuffle Deck");
		System.out.println("4. Play Solitaire Prime");
		System.out.println("5. Exit");
		System.out.print("User Input: ");
		int userInput = in.nextInt();
		return userInput;
	 }
	
	 public static void main(String args[])	{
		 // Makes sure loop keeps going
		 boolean keepGoing = true;
		 Deck solitaireDeck = new Deck();
		 do	{
			int userInput = menu();
			
            //New Deck
            if (userInput == 1)	{
            	solitaireDeck = new Deck();
            }
            
            //Display Deck
            else if (userInput == 2)	{
            	solitaireDeck.display();
            }
            
            //Shuffle Deck
            else if (userInput == 3)	{
            	solitaireDeck.shuffle();
            }
            
            //Play the game
            else if (userInput == 4)	{
            	int sum = 0;
            	int pile = 1;
            	Card dealt;
//            	boolean isPrime;
            	while (solitaireDeck.cardsLeft() > 0)	{
            		dealt = solitaireDeck.deal();
            		dealt.display();
            		System.out.print(", ");
            		sum += dealt.getValue();
            		if (isPrime(sum) && solitaireDeck.cardsLeft() != 0)	{
            			pile++;
            			System.out.print(" Prime: " + sum + "\n");
            			sum = 0;
            		}

            	}//end while
            	
            	if (isPrime(sum))	{
            		System.out.print(" Prime: " + sum + "\n");
            		System.out.println("\nWinner! Player won with " + pile + " piles");
            	}
            	
            	else	{
            		System.out.print(" Not Prime: " + sum + "\n");
            		System.out.println("\nMission failed, we'll get 'em next time! Loser!");
            	}
            	
            	
            }
            
            //Exit
            else if (userInput == 5)	{
            	break;
            }
            
            else	{
            	System.out.println("Invalid User Input. Enter a valid option.");
            }
            
		 }	while (keepGoing);
	 }
}
