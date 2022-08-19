package ZSGS;

public class Problem18 {

	public static void main(String[] args) {
		
		int a=2, b=2;		
		System.out.println("++a-b-- => " + (++a-b--));
		
		a=2; b=2;
		System.out.println("a%b++ => " + (a%b++));
		
		a=2; b=2;
		a*=b+5;
		System.out.println("a*=b+5" + a);
		
		// Unsigned bitwise right shift
		System.out.println("69>>>2 => " + (69>>>2));
		
		System.out.println(Integer.toBinaryString(69));
		System.out.println(Integer.toBinaryString(17));
		
	}
	
}
