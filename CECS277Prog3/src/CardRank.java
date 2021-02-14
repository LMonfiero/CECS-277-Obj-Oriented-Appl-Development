
public enum CardRank {
//	TWO, THREE, FOUR, FIVE, SIX, SEVEN, 
//	EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
	
	TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), 
	EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14);
	
	private int cardRank;
	
	private CardRank(int value)	{
		this.cardRank = value;
	}
	
	public int getRank()	{
		return cardRank;
	}
	
	public String toString()	{
		String str;
		switch(cardRank)	{
			case 2:
				str = "Two";
				break;
			case 3:
				str = "Three";
				break;				
			case 4:
				str = "Four";
				break;
			case 5:
				str = "Five";
				break;
			case 6:
				str = "Six";
				break;
			case 7:
				str = "Seven";
				break;
			case 8:
				str = "Eight";
				break;
			case 9: 
				str = "Nine";
				break;
			case 10:
				str = "Ten";
				break;
			case 11:
				str = "Jack";
				break;
			case 12:
				str = "Queen";
				break;
			case 13:
				str = "King";
				break;
			case 14:
				str = "Ace";
				break;
			default:
				str = "No card found.";
		}
		return str;
		
	}
}

