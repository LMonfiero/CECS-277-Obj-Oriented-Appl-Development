import java.util.*;


public class main {
	public static void main(String args[])	{
		Measurable[] accounts = new Measurable[3];
	    accounts[0] = new BankAccount(0);
	    accounts[1] = new BankAccount(10000);
	    accounts[2] = new BankAccount(2000);
		double averageBalance = Data.average(accounts);
		System.out.println("Average balance: " + averageBalance);
		System.out.println("Expected: 4000\n");
		
		Measurable[] countries = new Measurable[3];
		countries[0] = new Country("Uruguay", 176220);
		countries[1] = new Country("Thailand", 513120);
		countries[2] = new Country("Belgium", 30510);
		double averageArea = Data.average(countries);
		System.out.println("Average area: " + averageArea);
		System.out.println("Expected: 239950\n");
		
		Measurable[] people = new Person[5];
		people[0]  = new Person("Louis", 21);
		people[1]  = new Person("Do", 25);
		people[2]  = new Person("Sebastian", 22);
		people[3]  = new Person("Henry", 56);
		people[4]  = new Person("John Doe", 44);
		double averageAge = Data.average(people);
		System.out.println("Average age: " + averageAge);
		System.out.println("Expected: 33.6\n");
		
		ArrayList<BankAccount> betterAccounts = new ArrayList<BankAccount>();
		BankAccount acc1 = new BankAccount(1000);
		BankAccount acc2 = new BankAccount(5000);
		BankAccount acc3 = new BankAccount(4000);
		BankAccount acc4 = new BankAccount(2000);
		BankAccount acc5 = new BankAccount(3000);
		
		betterAccounts.add(acc1);
		betterAccounts.add(acc2);
		betterAccounts.add(acc3);
		betterAccounts.add(acc4);
		betterAccounts.add(acc5);
		
		for (BankAccount bal : betterAccounts) {
			System.out.print(bal.getBalance() + "  |  ");
		}
		System.out.println("\nExpected: 1000.0  |  5000.0  |  4000.0  |   2000.0  |  3000.0  |  ");
		
		Collections.sort(betterAccounts);
		System.out.println("\nNew and Improved!");
		for (BankAccount bal : betterAccounts) {
			System.out.print(bal.getBalance() + "  |  ");
		}
		System.out.println("\nExpected: 1000.0  |  2000.0  |  3000.0  |   4000.0  |  5000.0  |  ");		
	}
}
