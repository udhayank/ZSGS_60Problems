package ZSGS;

import java.util.Scanner;

public class Problem60 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of terms: ");
		int n = scanner.nextInt();
		
		String num = "1";
		int sum = 0;
		
		for (int i=1; i<n; i++) {
			System.out.print(num + " + ");
			sum += Integer.valueOf(num);
			num += '1';
		}
		System.out.println(num);
		sum += Integer.valueOf(num);
		
		System.out.println("The sum is: " + sum);

	}

}
