
public class Card {
	private CardRank rank;
	private CardSuit suit;
	
	//No default constructor since every card is different and unique
	public Card(CardRank r, CardSuit s)	{ //constructor
		this.rank = r;
		this.suit = s;
	}
	
	public void display()	{
		System.out.print(rank.toString() + " of " + suit.toString());
	}
	
	public String toString()	{
		return rank.toString() + " of " + suit.toString();
	}
	
	public int getValue()	{
		return rank.getRank();
	}
}
