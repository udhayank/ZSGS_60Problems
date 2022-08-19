package ZSGS;

import java.util.Scanner;

public class Problem24 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		char ch = scanner.next().charAt(0);
		int ascii = (int) ch;
		
		System.out.println("ASCII of " + ch + " is " + ascii);
		
		scanner.close();
		
	}
	
}
