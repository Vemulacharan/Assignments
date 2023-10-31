package ExceptionHandling;

import java.util.Scanner;
public class ArithmeticException10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number: ");
		int a = sc.nextInt();
		System.out.println("enter second number: ");
		int b = sc.nextInt();
		sc.close();
		try {
		    int add = a + b;
		    int sub = a - b;
		    int mul = a * b;
		    System.out.println("Addition: " + add + "\nSubtraction: " + sub + "\nMultiplication: " + mul );
		    if (b == 0) {
		        throw new ArithmeticException("Divisor not to be zero");
		    }
		    int div = a / b;
		    System.out.println( "\nDivision: " + (double)div);
		} catch (ArithmeticException e) {
		    System.err.println("Arithmetic expression: " +e.getMessage());
		}
		
		
	}
 
}
