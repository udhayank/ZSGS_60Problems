package ZSGS;

import java.util.Arrays;
import java.util.Scanner;

public class Problem52 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter string:");
		String str = scanner.next();
		str += scanner.nextLine();
		
		System.out.println(str);
				
		str = reverse(str);
		
		System.out.println(str);
		
		scanner.close();

	}
	
	static String reverse(String str) {
		String[] arr = str.split(" ");
		if (arr.length == 1) {
			return arr[0];
		} else if (arr.length == 2) {			
			return String.format("%s %s", arr[1], arr[0]);
		}
		
		return String.format("%s %s %s", arr[arr.length-1], reverse(String.join(" ", Arrays.copyOfRange(arr, 1, arr.length-1))), arr[0] );
	}

}
