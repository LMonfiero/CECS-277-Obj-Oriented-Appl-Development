import java.math.*;
import java.util.*;

public class CareTaker {
	private static List<Memento> mementoList = new ArrayList<Memento>();

    public static void add(Memento state)	{
        mementoList.add(state);
    }

    public static Memento get(int index)	{
        return mementoList.get(index);
    }

    public CareTaker()	{
        mementoList.add(new Memento(new BigInteger("0")));
        mementoList.add(new Memento(new BigInteger("1")));
    }
}
