package ZSGS;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter string of odd length: ");
		String str = scanner.next();
		
		for (int i=0, j=str.length()-1; j>=0 ; i++, j--) {
			for (int k=0; k <= str.length()-1; k++) {
				if (k == i) {
					System.out.print(str.charAt(i));					
				} else if (k == j) {
					System.out.print(str.charAt(i));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		scanner.close();

	}

}
