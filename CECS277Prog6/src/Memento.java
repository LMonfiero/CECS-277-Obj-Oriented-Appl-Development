import java.math.*;

public class Memento {
	private BigInteger state;
	
    public Memento(BigInteger state)	{
        this.state = state;
    }

    public BigInteger getState()    {
        return state;
    }
}
