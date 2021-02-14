package cecs277LabSingletonPattern;

import java.math.BigInteger;

public class SingletonRunner {

	public static void completion () {
		Logger.getLogger().log("Completed satisfactorily");
	}
	
	/*public static void main(String[] args) {
		Logger.setFile("LocalLog.txt");
		Logger.Slog("Test Log message");
		Logger.Slog("Another test message");
		
		String strInt = "";
		//Fibonacci fb = new Fibonacci("0");
		
		
		for (int i = 0; i <= 200; i++) {
			Logger myLog = Logger.getLogger();
			
			strInt = String.valueOf(i);
		
			
			
//			myLog.log("Fibonacci # " + i + " = " + Fibonacci.getFibonacci().next() );
			
			//myLog.log("Fibonacci Number: " + i + " = " + Fibonacci.getFibonacci().next(strInt));
			myLog.log("The Fibonacci Number: " + i + " = " + Fibonacci.getFibonacci().next());
		}
		completion();
		System.out.println("Completed satisfactorily.");
	}*/
	
	//Old
	/*
	public static int Fibonacci (int input) {
		if (input < 2) {
			return input;
		} else {
			return Fibonacci (input - 1) + Fibonacci (input - 2);
		}
	}
	
	public static void completion () {
		Logger.getLogger().log("Completed satisfactorily");
	}
	
	public static void main(String[] args) {
		Logger.setFile("LocalLog.txt");
		Logger.Slog("Test Log message");
		Logger.Slog("Another test message");
		for (int i = 0; i < 40; i++) {
			Logger myLog = Logger.getLogger();
			myLog.log("Fibonacci Number: " + i + " = " + Fibonacci (i));
		}
		completion();
		System.out.println("Completed satisfactorily.");
	}*/

}