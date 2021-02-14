
public enum CardSuit {
//	DIAMONDS, HEARTS, CLUBS, SPADES;
	DIAMONDS('D'), HEARTS('H'), CLUBS('C'), SPADES('S');
	
	private char cardSuit;
	
	private CardSuit(char suit)	{
		this.cardSuit = suit;
	}
	
	public int getSuit()	{
		return cardSuit;
	}
	
	public String toString()	{
		String str;
		switch(cardSuit)	{
			case 'D':
				str = "Diamonds ";
				break;
			case 'H':
				str = "Hearts ";
				break;
			case 'C':
				str = "Clubs ";
				break;
			case 'S':
				str = "Spades ";
				break;
			default:
				str = "No card found.";
		}
		return str;
		
	}
}
