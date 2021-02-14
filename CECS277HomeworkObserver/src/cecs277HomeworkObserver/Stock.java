package cecs277HomeworkObserver;


/**
 * Assignment: Homework 07 Observer Design Pattern
 * @author 	Wei-Hao Chiang, Neiman Peralta, Louis Monfiero
 * @version 
 * @Date	4/30/2020
 */

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
	
	/** Our list of current observers. */
	private List <Observer> observers = new ArrayList<>();
	
	/** name of the stock */
	private String name;
	
	private Bid bid;

	/**
	 * Contractor
	 * @param name of the stock
	 */
	public Stock(String name) {
		this.name = name;
	}

	public void trade(Bid bid) {
		this.bid = bid;
		notifyObservers();
	}
	
	/**
	 * getter for bid
	 * @return bid object
	 */
	public Bid getBid() {
		return this.bid;
	}
	
	/**
	 * get the name of the stock
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	

	@Override
	public boolean registerObserver(Observer observer) {
		if (observers.contains(observer)) {
			return false;
		} else {
			observers.add(observer);
			return true;
		}
	}

	@Override
	public boolean removeObserver(Observer observer) {
		if (observers.contains(observer)) {
			observers.remove(observer);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer obs: this.observers) {
			obs.update(this);
		}
	}

	

}// end Stock class
