package cecs277RoachMotel;
/**
 * The PayPal class.
 * @author Neiman Peralta, Neil Manansala, Wei-Hao Chiang
 * @version 2020-05-05
 */

public class PayPal implements PaymentStrategy {
	
	/** The name of PayPal owner */
	private String emailId;
	
	/** email of RoachPay owner */
	private String password;
	
	/**
	 * Constructor for RoachPay
	 * @param name 		the name of RoachPay owner
	 * @param email		email registered for the RoachPay account
	 */
	public PayPal(String emailId, String password) {
		this.emailId = emailId;
		this.password = password;		
	}// end constructor
	
	/**
	 * this method simply prints all the variables to the console
	 * showing the method that is used and the info about the payment
	 */
	@Override
	public String pay(double amount) {
		return "Paid : $" + amount + " using PayPal." + "Email: " + this.emailId + "password : " + this.password;
	}// pay()
	
}// end PayPal{}


