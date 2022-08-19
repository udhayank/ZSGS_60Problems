package ZSGS;

import java.util.Scanner;

public class Problem35 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		int factorial = 1;
		for (int i=1; i<=number; i++) {
			factorial *= i;
		}
		
		System.out.println("The factorial is " + factorial);
		
		scanner.close();
		
		int sum = 0;
		int digit = 0;
		while(factorial>0) {
			digit = factorial%10;
			factorial = factorial/10;
			sum += digit;
		}
		
		System.out.println("Sum of digits is " + sum);

	}

}
