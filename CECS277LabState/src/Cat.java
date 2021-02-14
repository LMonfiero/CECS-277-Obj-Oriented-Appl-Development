
public class Cat {
	private State state;
	private String mName;
	
	public Cat(String name)	{
		mName = name;
		state = new Asleep();
	}
	
	public void setState(State nState)	{
		state = nState;
	}

	public void sleep() {
		state.sleep(this);
	}

	public void eat() {
		state.eat(this);
	}

	public void play() {
		state.play(this);
	}

	public void ignore() {
		state.ignore(this);
	}
	
	public String toString()	{
		return mName + " " + state;
	}

}
