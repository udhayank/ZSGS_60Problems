package ZSGS;

public class Problem38 {

	public static void main(String[] args) {
		
		int[] arr = {3,5,6,4,2,8,7,9};
		
		System.out.println("Maximum value is " + maximum(arr));
		
	}
	
	static int maximum(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int a:arr) {
			if (a>max) {
				max = a;
			}
		}
		return max;
	}

}
