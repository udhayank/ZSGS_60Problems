package ZSGS;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter character: ");
		char letter = scanner.next().charAt(0);
		
		if (!((letter >= 65) && (letter <= 90))){ // Check if letter is between A-Z
			System.out.println("Not a valid character.");
			return;
		} else {
			while (letter <= 90) {
				System.out.print(letter);
				letter++;
			}
			System.out.println();
		}
		
	}

}
