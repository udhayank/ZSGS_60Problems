package ZSGS;

public class Problem48 {

	public static void main(String[] args) {
		
		int n = 9;
		
		for (int i=1; i<=n; i++) {
			
			// Spaces
			for (int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			
			// pattern
			int p = n-i+1;
			for (int j=1; j<=(2*i-1); j++) {
				if (j<i) {
					System.out.print(p + " ");	
					p++;
				} else {
					System.out.print(p + " ");	
					p--;
				}
			}
			
			System.out.println();
			
		}

	}

}
