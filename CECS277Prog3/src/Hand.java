import java.util.ArrayList;

//Can't inherit deck because deck creates a whole new deck
public class Hand	{
	public Hand()	{
		storage = new ArrayList<Card>();
	}
	
	private ArrayList<Card> storage; // make an array of cards
	private int top = 0;
	
	public void addCard(Card card)	{
		storage.add(card);
	}
	
	//Not needed but for testing purposes
	public void display()	{
		int index = 0;
		for (Card temp : storage)	{
			temp.display();
			System.out.print(" ");
		}
	}
	
	public void removeCard()	{
		storage.remove(0);
	}
	
	public Card deal()	{
		return storage.get(top++);
	}
	
	public void reset()	{
		top = 0;
	}
	
	public int howMany()	{
		return storage.size();
	}

}

