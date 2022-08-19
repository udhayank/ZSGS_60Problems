package ZSGS;

import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter lenngth of rectangle in metre: ");
		double length = scanner.nextDouble();
		
		System.out.print("Enter breadth of rectangle in metre: ");
		double breadth = scanner.nextDouble();
		
		Rectangle rectangle = new Rectangle(length, breadth);
		
		System.out.println("Area of square is: " + rectangle.area());
		
		scanner.close();
		
	}
	
}

class Rectangle {
	
	private double length;
	private double breadth;
	
	Rectangle (double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	double area() {
		return Math.round(length*breadth*1000.0)/1000.0;
	}
}