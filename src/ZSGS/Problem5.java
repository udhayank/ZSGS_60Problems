package ZSGS;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter character: ");
		char letter = scanner.next().charAt(0);
		
		if (letter >= 65 && letter <= 90) {
			for (char i=letter; i >= 65; i--) {
				for (char j=i; j >= 65; j--) {
					System.out.print(i);
				}
				System.out.println();
			}
		} else {
			System.out.println("Invalid character");			
		}
		
		scanner.close();

	}

}
