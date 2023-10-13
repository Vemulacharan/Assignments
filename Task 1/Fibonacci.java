package sampleprograms;
import java.util.*;
public class Fibonacci {
	public static void main(String args[]) {
		int a =0,b=1,c,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr n number");
		int n = sc.nextInt();
		sc.close();
		if(n==0) {
			System.out.println(a);
		}
		else {
			System.out.println(a);
			System.out.println(b);
		}
		for(i=2; i<=n; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
	}

}


