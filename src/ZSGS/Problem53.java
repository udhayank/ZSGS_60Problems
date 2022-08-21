package ZSGS;

import java.util.Scanner;

public class Problem53 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		String input = scanner.next();		
		char[] inArr = input.toCharArray();
		
		char ch = inArr[0];		
		int number = 0;
		String numStr = "";
		
		for (int i=1; i<inArr.length; i++) {
			if (inArr[i] >= 48 && inArr[i] <= 57) {
				numStr += (inArr[i] - 48);				
			} else {
				number = Integer.valueOf(numStr);
				for (int j=1; j<=number; j++) {
					System.out.print(ch);
				}
				numStr = "";
				ch = inArr[i];
			}
		}
		number = Integer.valueOf(numStr);
		for (int j=1; j<=number; j++) {
			System.out.print(ch);
		}
		
		scanner.close();

	}

}
