package ZSGS;

import java.util.List;
import java.util.Scanner;

public class Problem29 {

	public static void main(String[] args) {
		
		List<Character> vowels = List.of('a','e','i','o','u');
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		char ch = scanner.next().toLowerCase().charAt(0);
		
		if (!(ch >= 97 && ch <= 122)) {
			System.out.println("Not an alphabet");
			scanner.close();
			return;
		}
		
		if (vowels.contains(ch)) {
			System.out.println("The character is a vowel");
		} else {
			System.out.println("The character is a consonant");
		}		

		scanner.close();
		
	}

}
