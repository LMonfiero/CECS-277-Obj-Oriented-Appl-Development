import java.util.*;
public class CareTaker {
	private List<Memento> mlist = new ArrayList<Memento>();

	public void add(Memento m) {
		mlist.add(m);
	}

	public Memento get(int index) {
		return mlist.get(index);
	}
}