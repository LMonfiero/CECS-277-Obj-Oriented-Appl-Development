package cecs277HomeworkObserver;


/**
 * Assignment: Homework 07 Observer Design Pattern
 * @author 	Wei-Hao Chiang, Neiman Peralta, Louis Monfiero
 * @version 
 * @Date	4/30/2020
 */

public class Agent implements Observer {

	private String name;
	
	/** Constructor */
	public Agent (String name) {
		this.name = name;
	}
	
	@Override
	public void update(Subject sub) {
		Stock newSub = (Stock) sub;
		Bid newBid = newSub.getBid();
		System.out.print("Agent - name: " + this.name + " alerted to Bid- ");
		System.out.println(newBid.toString());	
	}
	
	/**
	 * agent buy stock
	 * @param stk		name of the stock to buy
	 * @param share		num of shares
	 * @param total		amount
	 */
	public void buy(Subject stk, int share, double total) {
		Bid buy = new Bid( (Stock)stk, share, total, TransactionType.BUY);
		((Stock) stk).trade(buy);
	}
	
	/**
	 * agent sell stock
	 * @param stk		name of the stock to sell
	 * @param share		num of shares
	 * @param total		amount
	 */
	public void sell(Subject stk, int share, double total) {
		Bid sell = new Bid( (Stock)stk, share, total, TransactionType.SELL);
		((Stock) stk).trade(sell);
	}
	
//	@Override
//	public void update(Subject sub) {
//		Stock newSub = (Stock) sub;
//		lastSub = currentSub;
//		currentSub = (Subject) newSub.getBid();
//	}

}
