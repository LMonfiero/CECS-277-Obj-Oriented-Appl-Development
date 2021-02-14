import java.math.*;
import java.util.*;

public class main {
	public static CareTaker careTaker = new CareTaker();
	
	public static void main(String[] args)
    {
        long start , end;
        double dur;

        BigInteger f;//will be changed to BigInteger

        for(int i=0; i < 1000; i++) {
            start = System.nanoTime();
            f = FibonacciSequence(i);

            end = System.nanoTime();
            dur = (end - start) / 1000.0;
            System.out.printf("Fibo(%d): %210d (Nanoseconds: %12.4f)\n", i, f, dur);
        }

    }
	
	public static BigInteger FibonacciSequence (int n)	{
		if (n == 0)	{
			return BigInteger.valueOf(0);
		}
		
		else if (n == 1)	{
			return BigInteger.valueOf(1);
		}
		
		else	{
			try	{
				Memento memoOne = careTaker.get(n - 1);
				Memento memoTwo = careTaker.get(n - 2);			
				return memoOne.getState().add(memoTwo.getState());
			}	catch(Exception e)	{
				System.out.print("");
			}
			careTaker.add(new Memento(FibonacciSequence(n - 1)));
			Memento memoOne = careTaker.get(n - 1);
			Memento memoTwo = careTaker.get(n - 2);
			return memoOne.getState().add(memoTwo.getState());
		}
	}
}
