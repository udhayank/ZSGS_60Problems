package ZSGS;

public class Problem50 {

	public static void main(String[] args) {
		
		int n = 9;
		
		for (int i=n; i>0; i--) {
			
			for (int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			
			for (int j=1; j<=i; j++) {
				System.out.print(i + " ");
			}
			
			System.out.println();
			
		}

	}

}
