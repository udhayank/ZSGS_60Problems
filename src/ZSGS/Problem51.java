package ZSGS;

import java.util.Scanner;

public class Problem51 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number = scanner.nextInt();
		
		System.out.print("The number in reverse order is: ");
		
		int temp = 0;
		while(number>0) {
			temp = number%10;
			number = number/10;
			System.out.print(temp);
		}
		System.out.println();
		
		scanner.close();

	}

}
