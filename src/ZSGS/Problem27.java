package ZSGS;

import java.util.Scanner;

public class Problem27 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first number:");
		int number1 = scanner.nextInt();
		
		System.out.print("Enter second number:");
		int number2 = scanner.nextInt();
		
		int temp = number1;
		number1 = number2;
		number2 = temp;
		
		System.out.println("Number 1 is " + number1);
		System.out.println("Number 2 is " + number2);
		
		scanner.close();

	}
	
	
}
