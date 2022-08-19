package ZSGS;

import java.util.Scanner;

public class Problem28 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int number = scanner.nextInt();
		
		if (!(number >=0 )) {
			System.out.println("Invalid input");
			scanner.close();
			return;
		}
		
		System.out.println("The number is " + (isEven(number)? "Even": "Odd"));
		
		scanner.close();
		
	}
	
	static boolean isEven(int num) {
		return (num%2 == 0);
	}
}
