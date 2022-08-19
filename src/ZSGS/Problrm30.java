package ZSGS;

public class Problrm30 {

	public static void main(String[] args) {
		
		int a=10, b=40, c=30;
		System.out.println("Maximum among three is " + maximum(a,b,c));

	}
	
	static int maximum(int a, int b, int c) {
		return (a>b?a:b)>c?(a>b?a:b):c;
	}

}
