package cecs277MementoLab;

import java.util.*;
public class CareTaker {
	private List<Section.Memento> mlist = new ArrayList<>();

	public void add(Section.Memento m) {
		mlist.add(m);
	}

	/**
	 * Retrieve a particular memento from the list of mementos that we have.
	 * @param	index	The memento that you want.  The numbering starts at 0.
	 * 					If you run off the end of the ArrayList, you will throw
	 * 					an exception.
	 * @return			The Section instance requirested.
	 */
	public Section.Memento get(int index) {
		return mlist.get(index);
	}
}