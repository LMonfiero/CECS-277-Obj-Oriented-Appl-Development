

public class CatStateTester {

	public static void main(String[] args) {
		Cat typicalCat = new Cat("Fluffy");

		System.out.println(typicalCat);

		typicalCat.sleep();
		typicalCat.play();

		System.out.println(typicalCat);

		typicalCat.eat();
		typicalCat.play();
		typicalCat.eat();
		typicalCat.sleep();

		System.out.println(typicalCat);
	}
}
