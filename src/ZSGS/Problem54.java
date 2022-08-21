package ZSGS;

import java.util.Arrays;

public class Problem54 {

	public static void main(String[] args) {
		
		int[] arr = {4,2,3,1,7,8,9,6};
		
		sortOdd(arr);
		sortEven(arr);
		
		System.out.println(Arrays.toString(arr));

	}
	
	static void sortOdd(int[] arr) {
		for (int i=0; i<arr.length; i+=2) {
			for (int j = i+2; j<arr.length; j+=2) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	static void sortEven(int[] arr) {
		for (int i=1; i<arr.length; i+=2) {
			for (int j = i+2; j<arr.length; j+=2) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
