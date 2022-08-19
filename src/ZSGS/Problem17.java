package ZSGS;

import java.util.Scanner;

public class Problem17 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter radius of bigger circle: ");
		double radius1 = scanner.nextDouble();
		
		System.out.print("Enter radius of smaller circle: ");
		double radius2 = scanner.nextDouble();
		
		Circle circle1 = new Circle(radius1);
		Circle circle2 = new Circle(radius2);
		
		System.out.println("Area of the space between the circles is " + (Math.round(1000.0 * (circle1.area() - circle2.area())))/1000.0);		
		
		scanner.close();
		
	}
	
}

class Circle {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return Math.round(1000.0 * 3.14 * radius * radius )/1000.0;
	}
}
