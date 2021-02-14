/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
import java.util.Collection;

public class BankAccount implements Measurable, Comparable<BankAccount>
{  
   private double balance;

   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {   
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {   
      balance = initialBalance;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      balance = balance + amount;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
      balance = balance - amount;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }

   public double getMeasure()
   {
      return balance;
   }

@Override
/*	Want to compare balances of each account
 * 	If balance is greater return true, else false
 * 	@param BankAccount ba the balanace we're comparing
 * 	@return 1 if lhs is greater, 0 if equal, and -1 if rhs is greater
 * 
 */
	public int compareTo(BankAccount ba) {
		if (balance == ba.balance)	{
			return 0;
		}
		
		else if (balance > ba.balance){
			return -1;
		}
		
		return 1;
	}
}
