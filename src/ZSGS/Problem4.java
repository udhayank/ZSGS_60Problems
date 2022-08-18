package ZSGS;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		
		// Get inputs
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = scanner.nextInt();
		
		System.out.print("Enter first number: ");
		int b = scanner.nextInt();

		printMenu();
		
		System.out.print("Enter your choise: ");
		int choise = scanner.nextInt();
		
		// Convert integer to binary string
		String aBinary = Integer.toBinaryString(a>b?a:b);
		String bBinary = Integer.toBinaryString(a>b?b:a);
				
		// Print first binary
		System.out.println(aBinary + " => " + (a>b?a:b));
		// Print second binary
		for (int i=0; i < differenceInLength(aBinary, bBinary); i++) { // Adding 0s in empty space
			System.out.print("0");
		}
		System.out.println(bBinary + " => " + (a>b?b:a));
		
		for (int i=0; i < Integer.toBinaryString(a|b).length(); i++) {
			System.out.print("-");
		}
		System.out.println();
		
		// Choose operation with switch
		switch(choise) {
			case 1:
				for (int i=0; i < differenceInLength(aBinary, Integer.toBinaryString(a|b)); i++) {
					System.out.print("0");
				}
				System.out.println(Integer.toBinaryString(a|b) + " => " + (a|b));
				break;
				
			case 2:
				for (int i=0; i < differenceInLength(aBinary, Integer.toBinaryString(a&b)); i++) {
					System.out.print("0");
				}
				System.out.println(Integer.toBinaryString(a&b) + " => " + (a&b));
				break;
				
			case 3:
				for (int i=0; i < differenceInLength(aBinary, Integer.toBinaryString(a^b)); i++) {
					System.out.print("0");
				}
				System.out.println(Integer.toBinaryString(a^b) + " => " + (a^b));
				break;
				
			default:
				System.out.println("Invalid choise");				
		}
		
		scanner.close();
		
	}
	
	static int differenceInLength(String a, String b) {
		return a.length() - b.length();
	}
	
	static void printMenu() {
		System.out.println("Choose from the following bitwise operations:");
		System.out.println("1 - OR");
		System.out.println("2 - AND");
		System.out.println("3 - XOR");		
	}
	
}
