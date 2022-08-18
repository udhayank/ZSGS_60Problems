package ZSGS;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		printTable();

	}

	public static void printTable() {
		
		Scanner scanner = new Scanner(System.in);
		
		// Get inputs
		System.out.print("Enter table: ");
		int table = scanner.nextInt();
		
		System.out.print("Enter from: ");
		int from = scanner.nextInt();
		
		System.out.print("Enter to: ");
		int to = scanner.nextInt();
		
		// Print multiplication table
		System.out.println("Multiplication table of " + table);
		for (int i = from; i <= to; i++) {
			System.out.printf("%d x %d = %d", i, table, i*table).println();
		}
		
		// Print subtraction table
		System.out.println("Subtraction table of " + table);
		for (int i = from; i <= to; i++) {
			System.out.printf("%d - %d = %d", i, table, i-table).println();
		}
				
		
	}
}

