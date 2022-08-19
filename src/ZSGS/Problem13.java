package ZSGS;

import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter lenngth of side in metre: ");
		double side = scanner.nextDouble();
		
		Square square = new Square(side);
		
		System.out.println("Area of square is: " + square.area());
		
		scanner.close();
		
	}

}

class Square {
	
	private double side;
	
	Square(double side){
		this.side = side;
	}
	
	double area() {
		return Math.round(side*side*1000.0)/1000.0;
	}
	
}
