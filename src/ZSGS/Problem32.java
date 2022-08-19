package ZSGS;

import java.util.Scanner;

public class Problem32 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double number = scanner.nextDouble();
		
		if (number == 0) {
			System.out.println("The number is neither positive nor negative");
			scanner.close();
			return;
		}
		System.out.println("The number is " + (number>0? "positive":"negative"));
		
		scanner.close();

	}

}
