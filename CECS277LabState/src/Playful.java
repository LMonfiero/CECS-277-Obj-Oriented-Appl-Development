
public class Playful implements State {
	
	private State state;

	@Override
	public void sleep(Cat cat) {
		System.out.println("Meow, I guess I can sleep.");
		cat.setState(new Asleep());		
	}

	@Override
	public void eat(Cat cat) {
		System.out.println("Meow, I'll eat again, thank you hooman");
		cat.setState(new Hungry());
	}

	@Override
	public void play(Cat cat) {
		System.out.println("Meow, I'm still playful");
		cat.setState(new Playful());
	}

	@Override
	public void ignore(Cat cat) {
		System.out.println("Meow, bye hooman. Time to sleep");
		cat.setState(new Asleep());		
	}

	public String toString()	{
		return "is feeling playful";
	}
}
