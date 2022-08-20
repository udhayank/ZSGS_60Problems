package ZSGS;

import java.util.Arrays;

public class Problem46 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8};
		
		System.out.println("The array is:");
		System.out.println(Arrays.toString(arr));
		
		arr = rightRotateByOne(arr);
		System.out.println("The rotated array is:");
		System.out.println(Arrays.toString(arr));

	}
	
	static int[] rightRotateByOne(int[] arr) {
		int temp = arr[arr.length-1];
		for(int i=arr.length-1; i>0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		return arr;
	}

}
