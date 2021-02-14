
public class LetsEat {
	public static void main(String[] args) {

		//like bandj code example
		IceCreamShop dairyQueen = new DairyQueen();

		IceCream cone1;
		cone1 = dairyQueen.orderCone("Chocolate");
		System.out.println("Enjoying some " + cone1.getDescription() + " which costs " + cone1.cost());
		System.out.println("");

		IceCream cone2;
		cone2 = dairyQueen.orderCone("Strawberry");
		System.out.println("Enjoying some " + cone2.getDescription() + " which costs " + cone2.cost());
		System.out.println("");

		//TOPPINGS
		Dessert chocolateAndCherry = dairyQueen.orderCone("Chocolate");
		chocolateAndCherry = new Cherry(chocolateAndCherry);
		System.out.println("Enjoying some " + chocolateAndCherry.getDescription() + " which costs " + chocolateAndCherry.cost());
		System.out.println("");

		Dessert strawberryAndWhippedCream = dairyQueen.orderCone("Strawberry");
		strawberryAndWhippedCream = new WhippedCream(strawberryAndWhippedCream);
		strawberryAndWhippedCream = new HotFudge(strawberryAndWhippedCream);
		System.out.println("Enjoying some " + strawberryAndWhippedCream.getDescription() + " which costs " + strawberryAndWhippedCream.cost());
	}
}