package ZSGS;

public class Problem56 {

	public static void main(String[] args) {
		
		int input = 10;
		int num = 0;
		
		while (input > 0) {
			num++;
			input -= num;
		}
		
		int p = 1;
		
		for (int i=1; i<=num; i++) {
			
			for (int j=i; j<=num; j++) {
				System.out.print(" ");
			}
			
			for (int j=1; j<=i; j++) {
				System.out.print(p + " ");
				p++;
			}
			
			System.out.println();
			
		}

	}

}
