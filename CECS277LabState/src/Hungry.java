
public class Hungry implements State {
	
	private State state;

	@Override
	public void sleep(Cat cat) {
		System.out.println("Meow, I'm hungry not sleepy!");
		cat.setState(new Hungry());
		
	}

	@Override
	public void eat(Cat cat) {
		System.out.println("Meow, I'm full. Feeling. Sleepy.");
		cat.setState(new Asleep());
		
	}

	@Override
	public void play(Cat cat) {
		System.out.println("Meow, I guess I'll play with you, hooman.");
		cat.setState(new Playful());
		
	}

	@Override
	public void ignore(Cat cat) {
		System.out.println("Meow, I'm going to keep eating instead.");
		cat.setState(new Hungry());
		
	}

	public String toString()	{
		return "is feeling hungry";
	}

}
