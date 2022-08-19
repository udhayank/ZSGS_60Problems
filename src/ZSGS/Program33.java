package ZSGS;

import java.util.Scanner;

public class Program33 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		char ch = scanner.next().toLowerCase().charAt(0);
		
		if (ch >= 97 && ch <= 122) {
			System.out.println("Character is an alphabet");
		} else {
			System.out.println("Character is not an alphabet");
		}

		scanner.close();	
		
	}

}
