
public class Card {
	private char rank;
	private char suit;
	
	//No default constructor since every card is different and unique
	public Card(char r, char s)	{ //constructor
		rank = r;
		suit = s;
	}
	
	public void display()	{
		//need to complete Example: Ace of Hearts = AH
		// Queen of D = QD
		// 3 of clubs = 3C, Ten of Spades = 10S
		//Makes sure it prints 10 instead of T
		if (rank == 'T')	{	System.out.print("10" + suit);	}
		else	{	System.out.print(rank + "" + suit);	}
	}
	
	public int getValue()	{
		//Initializing value
		int value = 0;
		//If/else statement to see if it's a face card or regular card
		if (Character.isLetter(rank))	{
			switch(rank)	{
			case 'A':
				value = 1;
			case 'T':
				value = 10;
			case 'J':
				value = 10;
			case 'Q':
				value = 10;
			case 'K':
				value = 10;
			}
		}
		else 	{
			value = Character.getNumericValue(rank);
		}
		return value;
	}
}
