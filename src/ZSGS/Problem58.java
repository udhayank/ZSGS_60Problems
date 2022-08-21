package ZSGS;

import java.util.Scanner;

public class Problem58 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = scanner.nextInt();
		
		for (int i=1; i<n; i++) {
			
			for (int j=i; j<=n; j++) {
				System.out.print("*");
			}
			
			for (int j=1; j<i; j++) {
				System.out.print("_");
			}
			
			for (int j=1; j<i; j++) {
				System.out.print("_");
			}
			
			for (int j=i; j<=n; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		for (int i=1; i<=n; i++) {
			
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			for (int j=i; j<n; j++) {
				System.out.print("_");
			}
			
			for (int j=i; j<n; j++) {
				System.out.print("_");
			}
			
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		scanner.close();

	}

}
