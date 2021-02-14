package cecs277HomeworkObserver;


/**
 * Assignment: Homework 07 Observer Design Pattern
 * @author 	Wei-Hao Chiang, Neiman Peralta, Louis Monfiero
 * @version 
 * @Date	4/30/2020
 */

public class Bid {

	private Stock stck;
	private int shares;
	private double totalAmount;
	private TransactionType transType;
	
	/** Constructor */
	public Bid(Stock s, int shares, double total, TransactionType type) {
		this.stck = s;
		this.shares = shares;
		this.totalAmount = total;
		this.transType = type;
	}

	@Override
	public String toString() {
		return "Symbol:" + this.stck.getName() + " " + this.transType + "ING " + this.shares + " Shares for the amount: $" + totalAmount;
	}

}//  end of Bid class
