import java.math.*;
import java.util.*;


public class Originator {
	private BigInteger state;

    public void setState(BigInteger state)    {
        this.state = state;
    }

    public BigInteger getState()    {
        return state;
    }
    public void getStateFromMemento(Memento memento)	{
        state = memento.getState();
    }

    public Memento saveStateToMemento()	{
        return new Memento(state);
    }
}
