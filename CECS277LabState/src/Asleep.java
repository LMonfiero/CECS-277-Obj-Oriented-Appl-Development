
public class Asleep implements State {
	
	private State mState;

	@Override
	public void sleep(Cat cat) {
		System.out.println("Meow, I'm sleeping... but it's making me hungry!");
		cat.setState(new Hungry());
		
	}

	@Override
	public void eat(Cat cat) {
		System.out.println("Meow, I'll eat!");
		cat.setState(new Playful());
	}

	@Override
	public void play(Cat cat) {
		System.out.println("Meow, I'll keep sleeping... too tired to play...");
		cat.setState(new Asleep());
		
	}

	@Override
	public void ignore(Cat cat) {
		System.out.println("Meow, I'll keep ignoring you... by sleeping...");
		cat.setState(new Asleep());
	}

	public String toString()	{
		return "is asleep";
	}

}
