package sampleprograms;

import java.util.*;
public class Larger {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a value :");
		int a = scan.nextInt();
		System.out.println("Enter b value :");
		int b = scan.nextInt();
		System.out.println("Enter c value :");
		int c = scan.nextInt();
		scan.close();
		if(a>b && a>c) {
			System.out.println("a is larger");
		}
		else if(b>a && b>c) {
			System.out.println("b is larger");
		}
		else {
			System.out.println("c is larger");
		}
	}

}
