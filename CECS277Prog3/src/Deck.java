import java.util.Random;
import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> storage; // make an array of cards
	private int top = 0;
	
	public Deck()	{
		//Hearts, Diamonds, Spades, Clubs
		CardSuit [] suits = {CardSuit.DIAMONDS, CardSuit.HEARTS, CardSuit.CLUBS, CardSuit.SPADES};
		CardRank [] ranks = {CardRank.ACE, CardRank.TWO, CardRank.THREE, CardRank.FOUR, CardRank.FIVE, CardRank.SIX, 
				CardRank.SEVEN, CardRank.EIGHT, CardRank.NINE, CardRank.TEN, CardRank.JACK, CardRank.QUEEN, CardRank.KING};
		
		storage = new ArrayList<Card>();
		Card C1;
		for (int s = 0; s < suits.length; s++)	{
			for (int r = 0; r < ranks.length; r++)	{
				C1 = new Card(ranks[r], suits[s]);
				storage.add(C1);
			}
		}
	}
	
	public void display()	{
//		for (int i = 0; i < 52; i++)	{
//			storage.get(i).display(); //calls card's display function
//			if (i % 13 != 0 || i == 0)	{
//				System.out.print(", ");
//			}
////			System.out.print(" ");
//			
//			if (i % 13 == 0 && i != 0)	{
//				System.out.println();
//			}
//		}
		int index = 0;
		for (int s = 0; s < 4; s++)	{
			for (int r = 0; r < 13; r++)	{
				storage.get(index).display();
				System.out.print(" ");
				index++;
			}
			System.out.println();
		}
	}

	public void shuffle()	{
		Random rand = new Random();
		Card temp;
		//Shuffles 10000 times
		for (int i = 0; i < 10000; i++) {
			//Generates random x and y ints from 0 to 51
			int x = rand.nextInt(52);
			int y = rand.nextInt(52);
			//Saves card into temp and then replaces x with y and puts temp into y
			temp = storage.get(x);		
			//Uses set(index, element)
			storage.set(x, storage.get(y));
			storage.set(y, temp);
		}
	}
	
	public Card deal()	{
		return storage.get(top++);
	}
	
	public int cardsLeft()	{
		return storage.size() - top;
	}
}
