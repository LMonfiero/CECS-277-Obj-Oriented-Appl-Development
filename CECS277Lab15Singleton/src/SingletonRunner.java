public class SingletonRunner {
	public static void main(String[] args) {
		
		MathLibrary libOne = MathLibrary.getMathLibrary();
		MathLibrary libTwo = MathLibrary.getMathLibrary();
		libOne.display(); //Is default to 1
		libOne.someMathMethod(); // Changes the single int to -1
		libOne.display(); // Should display -1
		libOne.anotherMathMethod(); //Changes the single int to 0
		libOne.display(); //Should display 0
		libTwo.display(); //If it is just the single instance, it should also display 0
		libTwo.someMathMethod(); //Changes it back to -1
		libOne.display(); //Should be -1 since it is the same instance, regardless of which lib I change	
		System.out.println("Demonstrating Library One's toString() method: " + libOne.toString());
		System.out.println("Demonstrating Library Two's toString() method: " + libTwo.toString());
		System.out.println("Displaying Library One's Hashcode: " + libOne.hashCode());
		System.out.println("Displaying Library Two's Hashcode: " + libTwo.hashCode());
	}
}
