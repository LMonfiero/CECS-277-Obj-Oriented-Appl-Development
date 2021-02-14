package cecs277LabAdapterPattern;

public class AdapterRunner {
	 public static void main(String[] args) {
		 Point upLeft = new Point(4, 4);
		 NewRectangle newie = new NewRectangle(upLeft, 3, 4);
		 OldRectangle adaptee = new RectangleAdapter(newie);
		 System.out.println("My Getters:");
		 System.out.println("Area: " + adaptee.getArea() + " -- Perimeter: " + adaptee.getPerimeter() + " -- Diagonals: " + adaptee.getDiagonal());
		 System.out.println("Corners: Upper-Left: " + adaptee.getCorners()[0]);
		 System.out.println("Corners: Upper-Right: " +adaptee.getCorners()[1]);
		 System.out.println("Corners: Lower-Left: " + adaptee.getCorners()[2]);
		 System.out.println("Corners: Lower-Right: " +adaptee.getCorners()[3]);
	 }
}
