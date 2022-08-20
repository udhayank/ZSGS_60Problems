package ZSGS;

import java.util.Arrays;

public class Problem43 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8};
		
		System.out.println("The array is:");
		System.out.println(Arrays.toString(arr));
		
		arr = leftRotateByOne(arr);
		System.out.println("The rotated array is:");
		System.out.println(Arrays.toString(arr));

	}
	
	static int[] leftRotateByOne(int[] arr) {
		int temp = arr[0];
		for(int i=0; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = temp;
		return arr;
	}

}
