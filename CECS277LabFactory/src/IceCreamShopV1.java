/**
 * Demonstration of the Factory pattern
 */

public class IceCreamShopV1 {

 private DairyQueen factory;
 
 public IceCreamShopV1(DairyQueen factory) {
  this.factory = factory;
 }
 
 public IceCream orderCone(String type) {
  IceCream cone;
  
  cone = factory.getIceCream(type);
  
  cone.scoop();
  
  return cone;
 }
 
 public IceCream eatCone(String type) {
	  IceCream cone;
	  
	  cone = factory.getIceCream(type);
	  
	  cone.eat();
	  
	  return cone;
}
 
// public static void main(String[] args) {
//	 DairyQueen factory = new IceCreamFactory();
//  IceCreamShopV1 shop = new IceCreamShopV1(factory);
//  
//  shop.orderCone("Chocolate");
// }
}
