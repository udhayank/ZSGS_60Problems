package ZSGS;

import java.util.Scanner;

public class Problem59 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("String 1: ");
		String str1 = scanner.next();
		
		System.out.print("String 2: ");
		String str2 = scanner.next();
		
		System.out.println(str1.indexOf(str2));
		
		scanner.close();

	}

}
