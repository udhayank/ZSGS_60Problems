package ZSGS;

import java.util.Scanner;

public class Problem31 {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		double a = scanner.nextDouble();
		
		System.out.print("Enter b: ");
		double b = scanner.nextDouble();
		
		System.out.print("Enter c: ");
		double c = scanner.nextDouble();
		
		// calculate discriminant
		double d =  b*b - 4.0*a*c ;
		
		if (d > 0) {
			// Two real roots
			double x1 = Math.round( 1000.0 * ((-1.0*b) + Math.sqrt(d)) / 2.0*a ) / 1000.0; 
			double x2 = Math.round( 1000.0 * ((-1.0*b) - Math.sqrt(d)) / 2.0*a ) / 1000.0;			
			System.out.println("The roots of the equation are " + x1 + " and " + x2);
		} else if (d == 0) {
			// One real root
			double x1 = Math.round( 1000.0 * ((-1.0*b) + Math.sqrt(d)) / 2.0*a ) / 1000.0;
			System.out.println("The root of the equation is " + x1);			
		} else {
			// Two complex roots
			double real = Math.round(1000.0 * (-1.0*b)/(2.0*a) )/ 1000.0;
			double imag = Math.round(1000.0 * Math.sqrt(-1.0 * d) / (2.0*a) )/1000.0;
			System.out.println("The roots of the equation are " + real + "+i" + imag + " and " + real + "-i" + imag);
		}
						
		scanner.close();
		
	}
	


}
