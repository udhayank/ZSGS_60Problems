package ZSGS;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		String number1 = scanner.next();
		String number2 = "";
		
		for (int i=number1.length()-1; i>=0; i--) {
			number2 = number2 + number1.charAt(i);
		}
		
		int number3 = Integer.valueOf(number1) - Integer.valueOf(number2);
		
		System.out.printf("%s - %s = %d", number1, number2, number3).println();
		
		scanner.close();
	}

}
