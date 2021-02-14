package cecs277RoachMotel;

/**
 * The MasterRoach class.
 * @author Neiman Peralta, Neil Manansala, Wei-Hao Chiang
 * @version 2020-05-05
 */

public class MasterRoach implements PaymentStrategy{
	
	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	/**
	 * Constructor for CreditCardStrategy
	 * @param name		name on the card
	 * @param cardNum	card number
	 * @param cvv		cvv on the back of the card
	 * @param date		expiration data
	 */
	public MasterRoach(String name, String cardNum, String cvv, String date) {
		this.name = name;
		this.cardNumber = cardNum;
		this.cvv = cvv;
		this.dateOfExpiry = date;
	}
	
	/**
	 * this method simply prints all the variables to the console
	 * showing the method that is used and the info about the payment
	 */
	@Override
	public String pay(double amount) {
		return "Paid: $" + amount + " using MasterRoach." + "Name: " + this.name + "Card# " + this.cardNumber + "cvv :  " + this.cvv + "Expiration data: " + this.dateOfExpiry;
	}// pay()
	
}// end MasterRoach {}