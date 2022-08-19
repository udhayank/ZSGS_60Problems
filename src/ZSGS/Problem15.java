package ZSGS;

import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter radius of cylinder: ");
		double radius = scanner.nextDouble();
		
		System.out.print("Enter length of cylinder: ");
		double length = scanner.nextDouble();
		
		Cylinder cylinder = new Cylinder(radius, length);
		
		System.out.println("Area of cylinder is: " + cylinder.area());
		
		scanner.close();
		
	}
	
}

class Cylinder {
	
	private double radius;
	private double length;
	
	Cylinder (double radius, double length) {
		this.radius = radius;
		this.length = length;
	}
	
	double area() {
		return Math.round(3.14 * radius * radius * length * 1000.0)/1000.0;
	}
	
}