package cecs277LabSingletonPattern;

public class FibonacciRunner {
	public static void main(String [] args)	{
		for (int i = 0; i < 200; i++)	{
			System.out.println("The Fibonacci Number: " + i + " = " + Fibonacci.getFibonacci().next());
		}
	}
	
	
}
