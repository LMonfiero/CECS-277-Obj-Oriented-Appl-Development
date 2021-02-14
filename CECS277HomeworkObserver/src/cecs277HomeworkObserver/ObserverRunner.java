package cecs277HomeworkObserver;


/**
 * Assignment: Homework 07 Observer Design Pattern
 * @author 	Wei-Hao Chiang, Neiman Peralta, Louis Monfiero
 * @version 
 * @Date	4/30/2020
 */

public class ObserverRunner {
	public static void main(String[] args) {
		
		Subject a = new Stock("A");
		Subject b = new Stock("B");
		Subject c = new Stock("C");
		
		Observer neiman = new Agent("Neiman Peralta");
		Observer weihao = new Agent("Wei-Hao Chiang");
		Observer louis = new Agent("Louis Monfiero");
		
		//a.registerObserver(weihao);
		a.registerObserver(neiman);
		
		b.registerObserver(weihao);
		//b.registerObserver(louis);
		
		//c.registerObserver(neiman);
		c.registerObserver(louis);
		
//		public Bid(Stock s, int shares, double total, TransactionType type)
		Bid a1 = new Bid( (Stock)a, 6, 200, TransactionType.BUY);
		Bid a2 = new Bid( (Stock)a, 36, 1234, TransactionType.SELL);
		//Bid a3 = new Bid( (Stock)a, 96, 600, TransactionType.BUY);
		Bid b1 = new Bid( (Stock)b, 10, 6000, TransactionType.BUY);
		Bid b2 = new Bid( (Stock)b, 20, 2000, TransactionType.SELL);
		//Bid b3 = new Bid( (Stock)b, 30, 1300, TransactionType.BUY);
		Bid c1 = new Bid( (Stock)c, 7, 500, TransactionType.BUY);
		Bid c2 = new Bid( (Stock)c, 8, 300, TransactionType.SELL);
		//Bid c3 = new Bid( (Stock)c, 9, 900, TransactionType.SELL);
		
		//Buy
		((Stock) a).trade(a1);
		
		((Stock) b).trade(b1);
		
		((Stock) c).trade(c1);
		
		System.out.println();
		
		//Sell
		((Stock) a).trade(a2);
		
		((Stock) b).trade(b2);
		
		((Stock) c).trade(c2);
		
		System.out.println();
		
		//Buy/Sell without using trade()
		((Agent) neiman).buy(a, 666, 999);
		((Agent) weihao).sell(b, 4, 75);
		((Agent) louis).buy(c, 22, 555);
		
	}// end of main

}// end of ObserverRunner 
