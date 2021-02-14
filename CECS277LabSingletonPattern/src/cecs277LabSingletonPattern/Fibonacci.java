package cecs277LabSingletonPattern;

import java.io.*; 
import java.util.*; 
import java.math.*; 

public class Fibonacci {
	
	
	private BigInteger bigInt;
	
	private static Fibonacci fiboSeq;
	
	private BigInteger currentVal;
	
	private BigInteger prevOne = BigInteger.valueOf(0);
	
	private BigInteger prevTwo = BigInteger.valueOf(1);
		
	private Fibonacci() {
	}
	
	private Fibonacci (String strInt) {
		BigInteger bigInt = new BigInteger(strInt);
		this.bigInt = bigInt;
	}
	
	public BigInteger next() {
		if (currentVal == null)	{
			this.currentVal = this.prevTwo.add(this.prevOne);
			return prevOne;
		}
        
        this.currentVal = this.prevTwo.add(this.prevOne);
        this.prevTwo = prevOne;
        this.prevOne = this.currentVal;
        
	    
		return currentVal;
		
	}
	
	public static Fibonacci getFibonacci() {
		if (fiboSeq == null)	{
			fiboSeq = new Fibonacci();
		}
		return fiboSeq;
		
		
		
	}
}
