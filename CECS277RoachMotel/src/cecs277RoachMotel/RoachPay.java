package cecs277RoachMotel;

/**
 * The RoachPay class.
 * @author Neiman Peralta, Neil Manansala, Wei-Hao Chiang
 * @version 2020-05-05
 */

public class RoachPay implements PaymentStrategy {
	
	/** The name of RoachPay owner */
	private String name;
	
	/** email of RoachPay owner */
	private String emailID;
	
	/**
	 * Constructor for RoachPay
	 * @param name 		the name of RoachPay owner
	 * @param email		email registered for the RoachPay account
	 */
	public RoachPay(String name, String email) {
		this.name = name;
		this.emailID = email;		
	}
	
	/**
	 * this method simply prints all the variables to the console
	 * showing the method that is used and the info about the payment
	 */
	@Override
	public String pay(double amount) {
		return "Paid : $" + amount + " using RoachPay." + "Name : " + this.name + "Email: " + this.emailID ;
	}// pay()
	
}// end RoachPay {}