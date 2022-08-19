package ZSGS;

import java.util.Scanner;

public class Problem25 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int number = scanner.nextInt();
		
		System.out.print("Enter divisor: ");
		int divisor = scanner.nextInt();
		
		System.out.println("Quotient is " + (number/divisor));
		System.out.println("Remainder is " + (number%divisor));
		
		scanner.close();
		
	}
	
}
