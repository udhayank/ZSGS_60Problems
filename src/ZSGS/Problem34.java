package ZSGS;

import java.util.Scanner;

public class Problem34 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		int sum=0;
		for (int i=1; i <= number; i++) {
			sum += i;
		}
		
		System.out.println("The sum is " + sum);
		
		scanner.close();
		
		int maxDigit = 0;
		int digit = 0;
		while(sum>0) {
			digit = sum%10;
			sum = sum/10;
			if (digit > maxDigit) {
				maxDigit = digit;
			}
		}
		
		System.out.println("Largest digit is " + maxDigit);

	}

}
