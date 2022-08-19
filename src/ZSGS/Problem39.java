package ZSGS;

public class Problem39 {

	public static void main(String[] args) {
		
		int[] arr = {3,5,6,4,2,8,7,9};
		
		System.out.println("Minimum value is " + minimum(arr));
		
	}
	
	static int minimum(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int a:arr) {
			if (a<min) {
				min = a;
			}
		}
		return min;
	}

}
