package ZSGS;

public class Problem44 {

	public static void main(String[] args) {
		
		int[] arr = {3,5,2,7,5,4,2,3,6,7};
		
		System.out.println("The duplicate elements are:");
		for (int i=0; i<arr.length-1; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
					break;
				}
			}
		}
		System.out.println();

	}

}
