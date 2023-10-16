package sampleprograms;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr n value: ");
		int n = sc.nextInt();
		sc.close();
		for(int i=1; i<=n; i++) {
			fact = fact*i;
		}
		System.out.println("factorial is :"+fact);
	}

}
